package super1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ele = new ElectricCar();
        ele.charge();
        ele.move();

        GasCar gas = new GasCar();
        gas.fillUp();
    }
}
