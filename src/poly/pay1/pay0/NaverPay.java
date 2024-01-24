package poly.pay1.pay0;

public class NaverPay implements Pay {
    @Override
    public boolean pay(int amount){
        System.out.println("naver페이 시스템과 연결힙니다");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
