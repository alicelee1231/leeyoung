package construct;

public class MemberDefault {
    String name;
    int age;
    int grade;

    MemberDefault(String name, int age){
        this(name,age, 90); //2번째 생성자를 부르는 것, This()는 첫번째 줄에서만 쓸 수 있음
        System.out.println("member default calling");
    };

    MemberDefault(String name, int age,int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("member default calling");
    };
}
