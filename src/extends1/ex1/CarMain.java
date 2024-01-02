package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar elect = new ElectricCar();
        elect.move();
        elect.move();


        GasCar gas = new GasCar();
        gas.move();
        gas.fillup();
    }
}
