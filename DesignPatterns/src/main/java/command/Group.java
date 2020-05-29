package command;

/**
 * Created by yh on 2018/7/12.
 */
public abstract class Group {
    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void plan();

    public abstract void rollback();
}
