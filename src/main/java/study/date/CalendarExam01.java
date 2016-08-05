package study.date;

import java.util.Calendar;

/**
 * Created by sould on 2016-07-15.
 */
public class CalendarExam01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int yyyy    = calendar.get(Calendar.YEAR);
        int month   = calendar.get(Calendar.MONTH)+1;
        int date    = calendar.get(Calendar.DATE);
        int hour    = calendar.get(Calendar.HOUR_OF_DAY);
        int minute  = calendar.get(Calendar.MINUTE);


        System.out.println(yyyy+" / "+month+" / "+date+" / "+hour+" / "+minute);
    }
}
