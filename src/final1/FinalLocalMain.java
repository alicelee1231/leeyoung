package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
       // data1 = 30; final은 한번 할당하면 값을 못 바꿈

        method(10);
    }
    static void method(final int parameter){
        //parameter = 10;//값을 메소드에 이미 할당해서 못바꿈

    }
}
