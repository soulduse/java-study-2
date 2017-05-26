package study.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sould on 2016-08-09.
 */
public class DateFormatApplyPattern {
    public static final String NEW_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat();
        sdf.applyPattern(NEW_DATE_FORMAT);
        String a = sdf.format(date);
        System.out.println(a);

//        print(date);
//        print(a);


    }


    private static void print(Object obj){
        if(obj instanceof String){
            String result = (String)obj;
            System.out.println("string value : "+result);
        }
        if(obj instanceof Date){
            System.out.println("date");
        }
    }
}
