package extends1.ex;

import java.util.Calendar;
import java.util.Date;

public class calTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); //calendar 객체 받아오기
        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        Date date = new Date();
    }
}
