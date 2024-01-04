package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}
