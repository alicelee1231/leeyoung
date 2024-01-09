package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

//        Parent parent2 = new Child();
//        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        //child 인스턴스의 경우 childMethod() 실행
       if(parent instanceof Child child){
           System.out.println("it is a child instance");
           child.childMethod();
       }else {
           System.out.println("it is not a child instance");
       }
    }
}
