package poly.pay1.pay0;

public class DefaultPay  implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("걀제 수단이 없습니다");
        return false;
    }
}
