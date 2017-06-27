package study.date;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 19.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class NumberOfCalander {

    public static void main(String[] args) throws InterruptedException {

        NumberOfCalander numberOfCalander = new NumberOfCalander();

        System.out.println(numberOfCalander.getHourOfDay());
        System.out.println(numberOfCalander.isRangeTime(9, 18));
        System.out.println(numberOfCalander.isRangeTime(9, 19));
        System.out.println(numberOfCalander.isRangeTime(9, 20));








        ScheduledExecutorService reloadScheduler = Executors.newSingleThreadScheduledExecutor();
//        reloadScheduler.scheduleWithFixedDelay(numberOfCalander.runnable, 5, 1, TimeUnit.SECONDS);
        reloadScheduler.scheduleAtFixedRate(numberOfCalander.runnable, 5, 1, TimeUnit.SECONDS);
        reloadScheduler.awaitTermination(10, TimeUnit.SECONDS);

    }

    public enum LocalCacheEnum
    {
        NumberOfCalander;
        //etc another functions
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println(new Date());
        }
    };

    public void timer(){
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("hour : "+hour);
    }

    public int getHourOfDay(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public boolean isRangeTime(int startTime, int stopTime){
        int currentTime = getHourOfDay();
        return (currentTime >= startTime && currentTime <= stopTime);
    }
}
