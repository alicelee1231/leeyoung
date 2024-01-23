package poly.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SnsSender(), new FaceBookSender()};
        for(Sender sender : senders){
            sender.sendMessage("welcome");
        }
    }
}
