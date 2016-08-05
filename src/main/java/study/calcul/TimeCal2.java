package study.calcul;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sould on 2016-07-05.
 */
public class TimeCal2 {
    public static void main(String[] args) {
        TimeCal2 timeCal2 = new TimeCal2();
        timeCal2.init();
    }


    private void init(){
        long currentTime = System.currentTimeMillis();
        long currentTime2 = System.currentTimeMillis()/1000;
        String today = getToday(currentTime);

        print("current : "+currentTime +" / today : "+today);
        print("currentTime / time(60) : "+(currentTime2/60));
        print("currentTime % time(60) : "+(currentTime2%60));
    }


    private String getToday(long dateVal){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(dateVal);
        String resultDateStr = sf.format(date);
        return resultDateStr;
    }

    private void print(String msg){
        System.out.println(msg);
    }
}
