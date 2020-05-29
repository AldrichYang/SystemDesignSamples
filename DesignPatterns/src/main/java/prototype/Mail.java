package prototype;

/**
 * Created by yh on 2018/7/6.
 */
public class Mail implements Cloneable {

    // 收件人
    private String Receiver;
    // 邮件名称
    private String subject;
    // 邮件内容
    private String appellation;
    // 邮件内容
    private String context;
    // 邮件尾部
    private String tail;

    public Mail() {
        System.out.println("无参构造函数执行了");
    }

    public Mail(AdTemplate adTemplate) {
        this.context = adTemplate.getAdContext();
        this.subject = adTemplate.getAdSubject();
        System.out.println("有参构造函数执行了");
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Mail clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        return (Mail) clone;
    }
}
