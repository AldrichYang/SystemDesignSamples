package proxy.generalProxy;

import proxy.IGamePlayer;

import java.util.Objects;

import static java.lang.System.out;

/**
 * Created by yh on 2018/7/3.
 */
public class GamePlayerInvisible implements IGamePlayer {

    private String username;

    public GamePlayerInvisible(IGamePlayer playerProxy, String username) throws Exception {
        if (Objects.isNull(playerProxy)) {
            throw new Exception("不能创建真实角色");
        } else {
            this.username = username;
        }
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
