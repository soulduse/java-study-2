package study.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by sould on 2016-04-22.
 */
public class CalendarExam {
    public static final String DAY_DATE_FORMAT = "yyyy-MM-dd";

    public static void main(String[] args) {
        CalendarExam ce = new CalendarExam();
        String result = ce.addDate();
        System.out.println(ce.makeCurrentTime());
        System.out.println(result);
    }

    private String makeCurrentTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHH");
        Date currentTime = new Date( );
        String dTime = formatter.format ( currentTime );
        return dTime;
    }

    private String addDate(){
        String strDate = null;
        try
        {
            Calendar cal = new GregorianCalendar(Locale.KOREA);
            cal.setTime(new Date());
            cal.add(Calendar.DAY_OF_YEAR, 0);

            SimpleDateFormat fm = new SimpleDateFormat(DAY_DATE_FORMAT);
            strDate = fm.format(cal.getTime());

        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        return strDate;
    }
}
