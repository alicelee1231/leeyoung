package ex4;

public class Cow extends AbstractAnimal {
    @Override
    public  void sound(){
        System.out.println("음매ㅐㅐ");
    }

    @Override
    public void move(){
        System.out.println("cow is moving");
    }

}
