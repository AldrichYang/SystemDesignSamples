package proxy.forceProxy;

/**
 * Created by yh on 2018/7/3.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String username, String password) {
        this.gamePlayer.login(username, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
