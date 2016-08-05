package study.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sould on 2016-05-04.
 */
public class DateAfter {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        try{

            Date a1 = dateFormat.parse("09:00:00");
            Date a2 = dateFormat.parse("09:00:01");
            Date a3 = dateFormat.parse("09:00:01");
            Date a4 = dateFormat.parse("09:00:02");

            System.out.println(a3.after(a2));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
