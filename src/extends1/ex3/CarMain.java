package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        HydrogenCar hy = new HydrogenCar();
        hy.fillHydrogen();
        hy.move();
        hy.openDoor();

        ElectriCar ele = new ElectriCar();
        ele.move();
    }
}
