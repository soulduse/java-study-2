package study.date;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by sould on 2016-07-28.
 */
public class DateAfterTwo {
    public static void main(String args[]) {
        DateAfterTwo a = new DateAfterTwo();
    }

    DateAfterTwo() {
        String DATE_FORMAT = "yyyy-MM-dd";
        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat(DATE_FORMAT);

        // Calendar class를 이용하여 비교하는 경우
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.set(1999, 12, 31);
        c2.set(1999, 12, 31);

        System.out.print(sdf.format(c1.getTime()));

        if (c1.before(c2))
        {
            System.out.print(" is before ");
        }
        if (c1.after(c2))
        {
            System.out.print(" is after ");
        }
        if (c1.equals(c2))
        {
            System.out.print(" same as ");
        }
        System.out.println(sdf.format(c2.getTime()));

        Date date1 = c1.getTime();
        Date date2 = c2.getTime();

        System.out.print(sdf.format(date1.getTime()));
        // Date casss를 이용하여 비교하는 경우
        if (date1.before(date2))
        {
            System.out.print(" is before ");
        }
        if (date1.after(date2))
        {
            System.out.print(" is after ");
        }
        if (date1.equals(date2))
        {
            System.out.print(" same as ");
        }

        System.out.println(sdf.format(date2.getTime()));

    }
}
