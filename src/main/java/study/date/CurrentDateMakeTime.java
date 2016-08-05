package study.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sould on 2016-07-13.
 */
public class CurrentDateMakeTime {

    private Date date;
    private SimpleDateFormat sdf;

    public static void main(String[] args) {
        CurrentDateMakeTime cdmt = new CurrentDateMakeTime();
        cdmt.init();
    }

    private void init(){
        date = new Date();
        sdf  = new SimpleDateFormat("HH:mm:ss");
        repeate();
    }

    private void repeate(){
        while(true){
            try{
                long current = System.currentTimeMillis();
                date.setTime(current);
                System.out.println(sdf.format(date));
                Thread.sleep(1000);
            }catch (InterruptedException ite){
                ite.printStackTrace();
            }

        }
    }
}
