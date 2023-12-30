package static2;

public class DecoData {

    private  int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++  -> 인스턴스가 생겨야지만이 호출이 가능

        staticValue++; //static은 모든 곳에 접근할 수 있음
    }

    public void instanceCall(){ //instance가 생성되어야지만이 호출이 가능
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }


    private void instanceMethod(){
        System.out.println("instanceValue = "+ instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
