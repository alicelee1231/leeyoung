package ex4;

public class Dog extends AbstractAnimal {
    @Override
    public  void sound(){
        System.out.println("bow wow");
    }


    @Override
    public void move(){
        System.out.println("dog is moving");
    }

}
