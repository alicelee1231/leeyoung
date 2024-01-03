package super1;

public class ElectricCar extends Car{

    @Override//없어도됨
    public void move(){
        System.out.println("moving the car fastly");
    }
    public void charge(){
        System.out.println("charging");
    }
    
}