package facade;

/**
 * Created by yh on 2018/5/21.
 */
public interface ILetterProcess {
     void writeContext(String context);
     void fillEnvelope(String address);
     void letterIntoEnvelope();
     void sendLetter();
}
