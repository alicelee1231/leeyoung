package extends1.ex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.*;

public class dayCal {
    public static void main(String[] args) {
        try {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Scanner sc = new Scanner(System.in);
            String ymd = sc.nextLine();
            Date date = formatter.parse(ymd);
            int endDt = cal.getMaximum(Calendar.DAY_OF_MONTH);
            //
            int startYear = Integer.parseInt(ymd.substring(0, 4));
            int startMonth = Integer.parseInt(ymd.substring(5, 7));
            int startDate = Integer.parseInt(ymd.substring(8, 10));

            cal.set(startYear, startMonth - 1, startDate);
            SimpleDateFormat real = new SimpleDateFormat("yyyy-MM-dd");
            String to = real.format(date);
            //입력한 값을 숫자로 변경해서 마지막 날이랑 비교
            int change = Integer.parseInt(to.substring(8,10));
//            System.out.println(startMonth + " startMonth");
//            System.out.println(startYear + " year");
            while(true){
               if(change >= endDt){
                   System.out.println(endDt+"enddt");
                   break;
               }
               cal.add(Calendar.DATE, 1);
               change++;
                System.out.println(real.format(cal.getTime()));
            }
//            System.out.println("end");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
