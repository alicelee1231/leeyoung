package static1;

public class Data3 {
    public String name; //멤버변수 , 인스턴스 변수 -> 인스턴스 생성해야 쓸수있고 인스턴스 만들때마다 만들어짐
    public static int count; //멤버 변수, static이 붙으면 static 변수, 정적 변수 또는 클래스 변수라고함
//클래스 변수는 클래스를 통해서 바로 접근이 가능해서 클래스 변수라고 함
    public Data3(String name){
        this.name= name;
        count++;
    }
}
