package ex4;

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

        moveAimal(dog);
        moveAimal(cat);
        moveAimal(cow);
        }
         private static void soundAimal(AbstractAnimal animal){
        System.out.println("test start");
        animal.sound();
        System.out.println("test over");

    }

    private static void moveAimal(AbstractAnimal animal){
        System.out.println("test animal moving start");
        animal.sound();
        System.out.println("test over");

    }
}
