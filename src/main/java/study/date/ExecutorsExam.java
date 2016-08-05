package study.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by sould on 2016-04-19.
 */
public class ExecutorsExam {

    public static final String DAY_DATE_FORMAT = "yyyy-MM-dd";
    public static final String NEW_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private static ScheduledExecutorService downloadService = null;

    public static void main(String[] args) {
        nextScheduleListener();
    }

    public static void makeDate(){
        String nextDownload = String.format("%s 00:00:00", getDay(0));
        SimpleDateFormat sdf = new SimpleDateFormat(NEW_DATE_FORMAT);
        try{
            Date date1 = sdf.parse(nextDownload);

        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void nextScheduleListener()
    {

        String nextDownload = String.format("%s 00:00:00", getDay(0));
        //String nextSchTime = String.format("%s 11:17:30", mDateTU.getDay(0));
        long initialDelay =  timeTransformation(nextDownload, NEW_DATE_FORMAT) - System.currentTimeMillis();
        long delay =  timeTransformation(nextDownload, NEW_DATE_FORMAT);

        System.out.println("Delay        : "+delay);
        System.out.println("Current      : "+System.currentTimeMillis());
        System.out.println("initialDelay : "+initialDelay);
        SimpleDateFormat sdf = new SimpleDateFormat(NEW_DATE_FORMAT);
        Date date1 = null;
        try{
            date1 = sdf.parse(nextDownload);

        }catch (Exception e){
            e.printStackTrace();
        }

        downloadService = Executors.newSingleThreadScheduledExecutor();
        final ScheduledFuture<?> timeHandle =
                downloadService.scheduleAtFixedRate(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(nextDownload);
                    }
                }, initialDelay, 3*1000, TimeUnit.MILLISECONDS);
    }



    public static long timeTransformation(String date, String pattern)
    {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
            return formatter.parse(date).getTime();

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    public static String getDay(int dayIndex)
    {
        return setAddDate(dayIndex);
    }

    public static String setAddDate(int dayIndex)
    {
        String strDate = null;
        try
        {
            Calendar cal = new GregorianCalendar(Locale.KOREA);
            cal.setTime(new Date());
            cal.add(Calendar.DAY_OF_YEAR, dayIndex);

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
