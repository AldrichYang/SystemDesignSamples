package proxy.forceProxy;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/3.
 */
public class GamePlayer implements IGamePlayer {


    private String username = "";
    private IGamePlayer proxy = null;

    public GamePlayer(String username) {
        this.username = username;
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return proxy;
    }

    @Override
    public void login(String username, String password) {
        if (this.isProxy()) {
            out.println(username + "登录游戏...");
        } else {
            out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            out.println(username + "在杀怪...");
        } else {
            out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            out.println(username + "升级了...");
        } else {
            out.println("请使用指定的代理访问");
        }
    }

    private boolean isProxy() {
        return proxy != null;
    }


}
