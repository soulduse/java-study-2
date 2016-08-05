package study.calcul;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sould on 2016-06-30.
 */
public class timeCal {
    public static final String NEW_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        long startTime       = 1467348150000L;
        long endTime         = 1467348180000L;
        long currentTime     = 1467348064777L;

        long startTime2      = 1467348870000L;
        long endTime2        = 1467348900000L;
        long currentTime2    = 1467348854924L;



        System.out.println("start   : "+getDateStr(startTime));
        System.out.println("current : "+getDateStr(currentTime));
        System.out.println("end     : "+getDateStr(endTime));
        System.out.println();
        System.out.println("start2   : "+getDateStr(startTime2));
        System.out.println("current2 : "+getDateStr(currentTime2));
        System.out.println("end2     : "+getDateStr(endTime2));
        System.out.println();
        System.out.println("start3   : "+getDateStr(1467349020000L));
        System.out.println("current3 : "+getDateStr(1467348934777L));
        System.out.println("end3     : "+getDateStr(1467349050000L));
        System.out.println();
        System.out.println("start4   : "+getDateStr(1467349140000L));
        System.out.println("current4 : "+getDateStr(1467349115121L));
        System.out.println("end4     : "+getDateStr(1467349170000L));
        System.out.println();
        System.out.println("start5   : "+getDateStr(1467349230000L));
        System.out.println("current5 : "+getDateStr(1467349204777L));
        System.out.println("end5     : "+getDateStr(1467349200000L));
        System.out.println();
        System.out.println("start6   : "+getDateStr(1467349470000L));
        System.out.println("current6 : "+getDateStr(1467349434937L));
        System.out.println("end6     : "+getDateStr(1467349500000L));
    }

    private static String getDateStr(long dateTime){
        Date date = new Date(dateTime);
        SimpleDateFormat sdf = new SimpleDateFormat(NEW_DATE_FORMAT);
        String dateStr = sdf.format(date);

        return dateStr;
    }
}
