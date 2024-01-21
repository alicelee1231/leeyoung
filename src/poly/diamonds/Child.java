package poly.diamonds;

//다중구현 가능 -> 인터페이스는 비어있기 때문에 다중구현이 가능함
public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("child.methodB");

    }

    @Override
    public void methodCommons() {
        System.out.println("child.methodCommon");

    }
}
