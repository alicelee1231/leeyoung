package super2;

public class ClassC extends ClassB {
    public ClassC(){
        super(10,20); //부모 클래스에서 생성자가 정의되어있으면 super 생성자 생략 못함
        System.out.println("ClassC 생성자");
    }
}
