package poly.pay1.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao결제
        String payOption1 = "kakao";
        int amout1 = 5000;
        payService.processPay(payOption1, amout1);

        //naver결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

    }
}