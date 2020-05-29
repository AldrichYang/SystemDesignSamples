package proxy.forceProxy;


/**
 * Created by yh on 2018/7/3.
 */
public interface IGamePlayer {
    void login(String username, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
