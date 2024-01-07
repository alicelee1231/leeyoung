package extends1.ex;
import java.text.SimpleDateFormat;
import java.util.*;
        import java.lang.*;
        import java.io.*;

// The main method must be in a class named "Main".
public class test {
    public static void main(String[] args) {
        //문제
        //월 초(2023-01-01) 등을 입력 받아
        //해당 월 1일부터 말일까지 print 하는 반복문을 작성하시오
        //단, 출력되는 변수는 String 이여야 함.
        try {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Scanner sc = new Scanner(System.in);
            String ymd = sc.nextLine();
            Date date = formatter.parse(ymd);
            date.before(date);

            cal.setTime(date);
            System.out.println(cal);
            //cal.add(Calendar.DAY_OF_MONTH,1);
            String rslt = formatter.format(cal.getTime());

            int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println(last);
            //System.out.println(rslt);
            for(int i = 0; i < last; i++){
                String date2 = formatter.format(cal.getTime());
                System.out.println(date2);
                cal.add(Calendar.DAY_OF_MONTH, 1);
            }
            while(){
                // true 일 때 루프 돌고
                //참이냐 거짓이냐 나오는 것이 조건...
                //before, after method찾기
                // false 이면 멈춤
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        String n = sc.nextLine();
//        System.out.println(n);
//        int month = Integer.parseInt(n.substring(0,4));





    }
}