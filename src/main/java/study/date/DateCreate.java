package study.date;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by sould on 2016-04-15.
 */
public class DateCreate {

    public static void main(String[] args) {
        DateCreate dc = new DateCreate();
        dc.shouldGetAfterOneDay();
    }

    @Test
    public void shouldGetAfterOneDay() {
        TimeZone utc = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(utc);
        calendar.set(1582, Calendar.OCTOBER , 4);
        String pattern = "yyyy.MM.dd";
        String theDay = toString(calendar, pattern, utc);
        Assert.assertEquals(theDay, "1582.10.04");


        calendar.add(Calendar.DATE, 1);
        String nextDay = toString(calendar, pattern, utc);
        Assert.assertEquals(nextDay, "1582.10.05");
    }

    private String toString(Calendar calendar, String pattern, TimeZone zone) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        format.setTimeZone(zone);
        return format.format(calendar.getTime());
    }
}
