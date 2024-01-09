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


//            System.out.println(formatter.format(cal.getTime()));
            cal.setTime(date); //date객체를 calendar로 변환
//            System.out.println(cal);
            //cal.add(Calendar.DAY_OF_MONTH,1);
            String rslt = formatter.format(cal.getTime());
//            System.out.println(rslt);
            int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//            System.out.println(last);
            //System.out.println(rslt);
//            for(int i = 0; i < last; i++){
//                String date2 = formatter.format(cal.getTime());//settime에서 지정한 날짜가 들어감
//                //calendar가 나타내는 날짜와 같은 날짜를 나타내는 date객체를 리턴
//                System.out.println(date2);
//                cal.add(Calendar.DAY_OF_MONTH, 1);
//            }
            //조건이 참이면 1일씩 더하기
            //입력한 값이 하루 뺀 값보다 작을 시 하루 씩 더해주기
            int change = Integer.parseInt(ymd);
            System.out.println(change + "change");
            //입력한 값이 하루 더한 값보다 작을 시 지난 달 일자 하루 씩 더하기
//            while(change < last){
//                 true 일 때 루프 돌고
//                참이냐 거짓이냐 나오는 것이 조건...
//                before, after method찾기
                 //false 이면 멈춤
//            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        String n = sc.nextLine();
//        System.out.println(n);
//        int month = Integer.parseInt(n.substring(0,4));





    }
}