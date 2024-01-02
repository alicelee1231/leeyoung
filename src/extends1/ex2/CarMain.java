package extends1.ex2;



public class CarMain {
    public static void main(String[] args) {
        ElectriCar elect = new ElectriCar();
        elect.move();
        elect.move();

        
        GasCar gas = new GasCar();
        gas.move();
        gas.fillup();
    }
}
