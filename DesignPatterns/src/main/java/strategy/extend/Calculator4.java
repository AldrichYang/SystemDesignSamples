package strategy.extend;

/**
 * Created by yh on 8/14/18.
 */
public enum Calculator4 {
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value;

    Calculator4(String _value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
//定义一个抽象方法，然后再每个枚举中实现
//    把原有定义在抽象策略中的方法移植到枚举中，每个枚举成员就成为一个具体策略。
    public abstract int exec(int a, int b);

}
