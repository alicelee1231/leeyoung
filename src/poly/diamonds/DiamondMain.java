package poly.diamonds;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommons();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommons();
    }
}
