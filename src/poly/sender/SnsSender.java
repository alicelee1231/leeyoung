package poly.sender;

public class SnsSender implements Sender{
    @Override
    public void sendMessage(String a){
        System.out.println("sending the sns :" + a);
    }
}
