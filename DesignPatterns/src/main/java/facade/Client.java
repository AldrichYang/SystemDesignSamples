package facade;

/**
 * Created by yh on 2018/5/21.
 */
public class Client {

    public static void main(String[] args) {
        ModernPostOffice hellPostOffice = new ModernPostOffice();
        String address = "where to go ";
        String context = "say something";
        hellPostOffice.sendLetter(context, address);

    }
}
