package poly.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String a){
        System.out.println("sending the facebook message :" + a );
    };
}
