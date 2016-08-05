package study.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by sould on 2016-04-28.
 */
public class Today {

    public static final String NEW_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String TIME_FORMAT = "HH:mm:ss";

    private Date date1 = null;
    private Date date2 = null;

    public static void main(String[] args) {
        Today today = new Today();
        today.init();
        today.print();
    }


    private void init(){
        date1 = new Date();
    }

    private void print(){
        setDate01();
        System.out.println(getTodayDateStr());
        System.out.println(getNextDayCheck("2016-07-21"));
        System.out.println(getNextDayCheck("2016-07-20"));
        System.out.println(getNextDayCheck("2016-07-21"));
        System.out.println(getNextDayCheck("2016-07-23"));
        setDate02();
        System.out.println("================================");
        System.out.println(getNextDayCheck2("2016-07-21"));
        System.out.println(getNextDayCheck2("2016-07-20"));
        System.out.println(getNextDayCheck2("2016-07-21"));
        System.out.println(getNextDayCheck2("2016-07-21"));
        setDate03();
        System.out.println("================================");
        System.out.println(getElevenPMTimeCheck());
        setDate04();
    }

    private void setDate01(){
        date1.setTime(System.currentTimeMillis());
        System.out.println(date1.getTime());
    }
    private void setDate02(){
        date1.setTime(System.currentTimeMillis());
        System.out.println(date1.getTime());
    }
    private void setDate03(){
        date1.setTime(System.currentTimeMillis());
        System.out.println(date1.getTime());
    }
    private void setDate04(){
        date1.setTime(System.currentTimeMillis());
        System.out.println(date1.getTime());
    }

    private String getTodayDateStr(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat(NEW_DATE_FORMAT);
        String dateText = format.format(date);

        return dateText;
    }


    private boolean getNextDayCheck(String playDate){
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        Calendar calendar = Calendar.getInstance();
        calendar.add(calendar.DATE, 1);
        String result = format.format(calendar.getTime());
        System.out.println("playDate : "+playDate+" / result :"+result);

        return playDate.equals(result);
    }

    private boolean getNextDayCheck2(String playDate){
        long tempSumTime = 1000*60*60*24;
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);
        long nextTimeTimeMillis = System.currentTimeMillis()+tempSumTime;
        Date date = new Date(nextTimeTimeMillis);
        String result = format.format(date);
        System.out.println("playDate : "+playDate+" / result :"+result);
        return playDate.equals(result);
    }

    private boolean getElevenPMTimeCheck(){
        String eleven    = "23:00:00";
        SimpleDateFormat format = new SimpleDateFormat(TIME_FORMAT);
        Date date = new Date();
        String result = format.format(date);
        System.out.println(result);
        return result.equals(eleven);
    }

}
