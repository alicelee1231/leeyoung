package static2;

public class DecodataMain {
    public static void main(String[] args) {
        System.out.println("1. static 호출");
        DecoData.staticCall();

        System.out.println("2. instance call");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. instance call");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
