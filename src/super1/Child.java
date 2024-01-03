package super1;


public class Child extends Parent{
    
    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속 관계 아니면 같은 패키지

        publicMethod();
        protectedMethod();
        
        //defaultMethod(); 안됨

        printParent();
    }
}