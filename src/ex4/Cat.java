package ex4;

public class Cat extends AbstractAnimal {
    @Override
    public  void sound(){
        System.out.println("meoow");
    }

    @Override
    public void move(){
        System.out.println("cat is moving");
    }

}
