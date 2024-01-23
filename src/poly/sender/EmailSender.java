package poly.sender;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String a) {
        System.out.println("sending the mail :" + a);
    }
}
