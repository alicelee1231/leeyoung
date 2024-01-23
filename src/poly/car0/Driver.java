package poly.car0;

public class Driver {
    //driver는 k3car, model3car에 의존한다.
    private K3Car k3Car;
    private Model3Car model3Car;

    public void setK3Car(K3Car k3Car ){
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("drive the car");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.offEngine();
            k3Car.pressAccelerator();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.offEngine();
            model3Car.pressAccelerator();
        }
    }
}
