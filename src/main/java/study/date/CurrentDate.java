package study.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sould on 2016-07-08.
 */
public class CurrentDate {

    public static void main(String[] args) {
        Date date = new Date();
        long current1 = date.getTime();
        long current2 = System.currentTimeMillis();

        System.out.println("current1 : "+current1+" / current2 : "+current2 );

//        System.out.println(getTodayLong(getToday(current1)));
        System.out.println("result >> "+(getDayLong()-current1));
        System.out.println(getToday(current1+(getDayLong()-current1)));


        long aDay = (1000*60)*60*24;
        System.out.println(aDay);
        System.out.println(getYearAndMonthAndDay()+"23:59:59");
        System.out.println("오늘의 MAX long-1 : "+getDayLong());
        System.out.println("오늘의 MAX long-2 : "+getMaxToday());

    }

    private static String getYearAndMonthAndDay(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    private static long getMaxToday(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat changeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String maxToday = sdf.format(date)+" 23:59:59";
        try{
            date = changeFormat.parse(maxToday);
        }catch (ParseException pe){
            pe.printStackTrace();
        }

        return date.getTime();
    }

    private static long getTodayLong(String strDate){
        int year = Integer.parseInt(strDate.substring(0,4));
        int month = Integer.parseInt(strDate.substring(5,7));
        int day = Integer.parseInt(strDate.substring(8,10));
        System.out.println("year : "+year+" / month : "+month+" / day : "+day);
        Date date = new Date(year, month, day);
        return date.getTime();
    }

    private static long getDayLong(){
        String from = "2016-07-25 23:59:59";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date to = null;
        try{
            to = sdf.parse(from);
        }catch (ParseException pe){
            pe.printStackTrace();
        }
        return to.getTime();
    }

    private static String getToday(long date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss");
        String resultMsg = sdf.format(new Date(date));

        return resultMsg;
    }
}
