package poly.pay1.pay0;

public class KaKaoPay implements Pay {
    @Override
    public boolean pay(int amount){
        System.out.println("카카오페이 시스템과 연결힙니다");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
