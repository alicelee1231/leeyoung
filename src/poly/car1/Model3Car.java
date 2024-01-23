package poly.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("model3car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("model3car.offEngine");

    }

    @Override
    public void pressAccelerator() {
        System.out.println("model3car.pressAccelerator");

    }
}
