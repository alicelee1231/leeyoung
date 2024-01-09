package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child > child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
         Parent parent = new Parent();
        System.out.println("Parent -> parent");
        System.out.println("value " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("parent -> child"); //변수는 오버라이딩 안됨
        System.out.println("value =" + poly.value); //오버라이딩이 우선권을 가짐
        poly.method();
    }
}
