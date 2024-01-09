package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

//        Parent parent2 = new Child();
//        call(parent2);
    }

    private static void call(Parent parent){
       if(parent instanceof Child){
           System.out.println("it is a child instance");
           Child child = (Child)parent; //child instance면 downcasting진행해서 child 메소드를 사용
           child.childMethod();
       }else {
           System.out.println("it is not a child instance");
       }
    }
}
