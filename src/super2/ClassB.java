package super2;

public class ClassB extends ClassA{

    public ClassB(int a){
        super(); //기본 생성자 생략 가능 -> 매개 변수가 없는 생성자의 경우 자바에서 자동으로 만들어줌
        System.out.println("classB 셍상지 a= " + a);
    }

    public ClassB(int a, int b){
        super();//생략가능
        System.out.println("classB 생성자 a =" + a + "b =" + b);
    }
}
