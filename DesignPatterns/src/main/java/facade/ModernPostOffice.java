package facade;

/**
 * Created by yh on 2018/5/21.
 */
public class ModernPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
