package facade;

import static java.lang.System.out;

/**
 * Created by yh on 2018/5/21.
 */
public class LetterProcessImpl implements ILetterProcess {

    @Override
    public void writeContext(String context) {
        out.println("填写信的内容..." + context);
    }

    @Override
    public void fillEnvelope(String address) {
        out.println("填写收件人地址以及姓名..." + address);
    }

    @Override
    public void letterIntoEnvelope() {
        out.println("把信放到信封中...");
    }

    @Override
    public void sendLetter() {
        out.println("邮递信件...");
    }
}
