package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
       // AbstractAnimal animal = new AbstractAnimal()  -> 불가능

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAimal(dog);
        soundAimal(cat);
        soundAimal(cow);
        }
         private static void soundAimal(AbstractAnimal animal){
        System.out.println("test start");
        animal.sound();
        System.out.println("test over");

    }
}
