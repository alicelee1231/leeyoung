package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        Child child = (Child) poly;
        child.childMethod();

        //down casting in temporary
        ((Child) poly).childMethod(); //--> 연산자 우선순위가 .이 먼저라서 괄호로 묶어줘야함
    }
}
