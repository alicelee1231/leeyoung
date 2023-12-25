package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //생성자 : 클래스 이름과 동일해야함
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 :" + name + age + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
