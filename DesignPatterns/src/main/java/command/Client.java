package command;

/**
 * Created by yh on 2018/7/12.
 */
public class Client {
    public static void main(String[] args) {
//        originalImpl();
        commandImpl();

    }

    public static void originalImpl() {
        System.out.println("客户要求增加一个需求...");
        RequirementGroup requirementGroup = new RequirementGroup();
        requirementGroup.find();
        requirementGroup.add();
        requirementGroup.plan();

        System.out.println("客户要求增加一个页面...");
        PageGroup pageGroup = new PageGroup();
        pageGroup.find();
        pageGroup.add();
        pageGroup.plan();

        System.out.println("客户要求删除一个页面...");
        PageGroup pageGroup1 = new PageGroup();
        pageGroup.find();
        pageGroup.delete();
        pageGroup.plan();
    }

    /**
     * 客户只需要下命令给接受者(Invoker),也不需要知道到底谁来执行。高内聚
     */
    public static void commandImpl() {
        System.out.println("客户要求增加一个需求...");
        Invoker invoker = new Invoker();
        Command command0 = new AddRequirementCommand();
        invoker.setCommand(command0);
        invoker.action();

        System.out.println("客户要求删除一个页面...");
        Command command1 = new DeletePageCommand();
        invoker.setCommand(command1);
        invoker.action();
    }
}
