package prototype;

import com.google.common.collect.Lists;

import java.util.Random;

/**
 * Created by yh on 2018/7/6.
 */
public class Client {

    public static void main(String[] args) {
        final int COUNT = 6;
        Mail mail = new Mail(new AdTemplate());
        mail.setTail("XX银行版权所有");
        Lists.charactersOf(new String(new char[COUNT])).forEach(x -> {
            Mail mailClone = mail.clone();
            mailClone.setAppellation(getRanderName(5) + "先生(女士)");
            mailClone.setReceiver(getRanderName(5) + "@" + getRanderName(8) + ".com");
            sendMail(mailClone);
        });
    }

    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t发送成功");
    }

    private static String getRanderName(int maxLength) {
        StringBuffer randerName = new StringBuffer();
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            randerName.append(source.charAt(random.nextInt(source.length())));
        }
        return randerName.toString();
    }
}
