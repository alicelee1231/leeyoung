package ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        //interface는 인스턴스 생성불가
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }
    public static void soundAnimal (InterfaceAnimal interfaceAnimal){
        System.out.println("start the animal sound");
        interfaceAnimal.sound();
        System.out.println("end up the animal sound");
    }
}
