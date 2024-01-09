package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = child; // = (Parent)child
        Parent parent2 = child; // = (Parent)child -> upcasting은 생략을 권장

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
