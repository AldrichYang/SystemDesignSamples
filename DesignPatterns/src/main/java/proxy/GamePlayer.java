package proxy;

import static java.lang.System.out;

/**
 * Created by yh on 2018/6/29.
 */
public class GamePlayer implements IGamePlayer {

    private String username;

    public GamePlayer(String username) {
        this.username = username;
    }

    @Override
    public void login(String username, String password) {
        out.println(username + "登录游戏...");
    }

    @Override
    public void killBoss() {
        out.println(this.username + "在打怪...");
    }

    @Override
    public void upgrade() {
        out.println(this.username + "级别升了一级...");
    }
}
