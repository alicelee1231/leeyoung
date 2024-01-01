package final1;

public class ConstatntMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 :" +1000);

        int currentUser = 999;
        process(currentUser++);
        process(currentUser++);
        process(currentUser++);

    }
    private static void process(int currentUser){
        System.out.println("참여자 수" +currentUser);
        if(currentUser > 1000) {
            System.out.println("대기자로 등록합니다.");
        }else {
            System.out.println("게임에 참여합니다");
        }
    }
}
