package construct;

public class MemberDefaultMain {
    public static void main(String[] args) {
    MemberDefault memberDefault1 = new MemberDefault("studen1",19);
    MemberDefault memberDefault2 = new MemberDefault("studen1",19,80);
    System.out.println(memberDefault1.name + memberDefault1.grade + memberDefault1.age);
    System.out.println(memberDefault2.name + memberDefault2.grade + memberDefault2.age);

    }
}
