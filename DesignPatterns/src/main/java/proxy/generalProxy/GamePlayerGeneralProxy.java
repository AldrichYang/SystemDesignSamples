package proxy.generalProxy;

import proxy.IGamePlayer;

/**
 * Created by yh on 2018/7/3.
 */
public class GamePlayerGeneralProxy implements IGamePlayer {

    private IGamePlayer player;

    public GamePlayerGeneralProxy(String username) {
        try {
            player = new GamePlayerInvisible(this, username);
        } catch (Exception e) {

        }
    }

    @Override
    public void login(String username, String password) {
        this.player.login(username, password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
    }
}
