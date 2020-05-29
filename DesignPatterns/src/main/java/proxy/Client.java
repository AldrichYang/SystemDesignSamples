package proxy;

import proxy.dynamicProxy.GamePlayerIH;
import proxy.generalProxy.GamePlayerGeneralProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

import static java.lang.System.out;

/**
 * Created by yh on 2018/6/29.
 */
public class Client {

    public static void main(String[] args) {
//        originCall();
//        proxy0();
//        proxy1();
//        proxy2();
//        proxyExtend();
        dynamicProxy();
    }


    /**
     * 最原始的调用业务类的实现
     */
    public static void originCall() {
        IGamePlayer gamePlayer = new GamePlayer("yangheng");
        out.println("游戏开始时间:" + LocalDateTime.now());
        gamePlayer.login("yangheng", "password");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        out.println("游戏结束时间:" + LocalDateTime.now());

    }

    /**
     * 代理模式的1级实现：主动代理
     * 1. 主动调用代理类。被代理类传递给代理对象
     * 2. 代理类不做任何额外处理
     */
    public static void proxy0() {
        IGamePlayer gamePlayer = new GamePlayer("yangheng");
        out.println("游戏开始时间：" + LocalDateTime.now());
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
        out.println("游戏结束时间:" + LocalDateTime.now());
    }

    /**
     * 代理模式的2级实现：普通代理
     * 1. 屏蔽真实业务类，场景类只知道代理类的实现
     * 2. 只能通过代理类访问业务功能，不能直接new业务对象
     */
    public static void proxy1() {
        IGamePlayer gamePlayer = new GamePlayerGeneralProxy("yangheng");
        out.println("游戏开始时间：" + LocalDateTime.now());
        gamePlayer.login("yangheng", "password");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        out.println("游戏结束时间:" + LocalDateTime.now());

    }

    /**
     * 代理模式的2级实现：强制代理
     * 1. 只能通过真实角色指定的代理类来访问，不能通过真实角色，非真实角色指定的代理类访问
     */
    public static void proxy2() {
        proxy.forceProxy.IGamePlayer gamePlayer = new proxy.forceProxy.GamePlayer("杨恒");
//        不能通过非真实角色指定的代理类访问
        //        gamePlayer = new designPatterns.proxy.forceProxy.GamePlayerProxy(gamePlayer);
        gamePlayer = gamePlayer.getProxy();
        out.println("游戏开始时间：" + LocalDateTime.now());
        gamePlayer.login("yangheng", "password");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        out.println("游戏结束时间:" + LocalDateTime.now());

    }

    /**
     * 代理模式的扩展实现：在代理类增强功能
     */
    public static void proxyExtend() {
        IGamePlayer gamePlayer = new GamePlayer("yangheng");
        gamePlayer = new proxy.proxyExtend.GamePlayerProxy(gamePlayer);
        out.println("游戏开始时间：" + LocalDateTime.now());
        gamePlayer.login("yangheng", "password");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        out.println("游戏结束时间:" + LocalDateTime.now());

    }

    /**
     * 动态代理的基本实现：
     * Proxy和InvocationHandler，一个负责动态产生代理类，一个负责实现实际业务功能
     */
    public static void dynamicProxy() {
        IGamePlayer player = new GamePlayer("yangheng");
        InvocationHandler handler = new GamePlayerIH(player);
        out.println("游戏开始时间：" + LocalDateTime.now());
        // 获得类的class loader
        ClassLoader classLoader = player.getClass().getClassLoader();
        Object obj = Proxy.newProxyInstance(classLoader, player.getClass().getInterfaces(), handler);
        out.println(obj.getClass());
        out.println(obj instanceof IGamePlayer);
        IGamePlayer proxy = (proxy.IGamePlayer) obj;
        proxy.login("yangheng", "password");
        proxy.killBoss();
        proxy.upgrade();
        out.println("游戏结束时间:" + LocalDateTime.now());

    }


}
