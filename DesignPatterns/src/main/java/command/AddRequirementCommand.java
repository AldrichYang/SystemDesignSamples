package command;

/**
 * Created by yh on 2018/7/12.
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
