package study.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by sould on 2016-07-07.
 */
public class WeekMake {

    public static final String DAY_DATE_FORMAT = "yyyy-MM-dd";

    public static void main(String[] args) {
        System.out.println(weekDayMaker("thu"));
    }

    public static String weekDayMaker(String week){
        final String[] weekArr = {"sun","mon", "tue", "wed", "thu", "fri", "sat"};
        int yoilNum = -1;
        for(int i=0; i<weekArr.length; i++){
            if(weekArr[i].equals(week)){
                yoilNum = i+1;
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DAY_DATE_FORMAT);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, yoilNum);
        Date date = calendar.getTime();
        String dateStr = simpleDateFormat.format(dateCompare(date, today()));

        return dateStr;
    }

    /*
		0 - 날짜가 같음
		1 - 날짜a가 날짜b 보다 이후의 날짜
	   -1 - 날짜a가 날짜b 보다 이전의 날짜
	 */
    private static Date dateCompare(Date a, Date b){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DAY_DATE_FORMAT);
        String dateA = simpleDateFormat.format(a);
        String dateB = simpleDateFormat.format(b);
        Calendar c = Calendar.getInstance();
        c.setTime(a);

        if(dateA.compareTo(dateB) < 0){
            c.add(c.DATE, +7);
            return c.getTime();
        }else{
            return a;
        }
    }

    public static Date today(){
        return Calendar.getInstance().getTime();
    }
}
