package study.schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 6.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class ScheduleTest {
    public static void main(String[] args) {
        ScheduledJob job = new ScheduledJob();
        Timer jobScheduler = new Timer();
        jobScheduler.scheduleAtFixedRate(job, 1000, 3000);
//        try {
//            Thread.sleep(20000);
//        } catch(InterruptedException ex) {
//            //
//        }
//        jobScheduler.cancel();
    }

    static class ScheduledJob extends TimerTask {

        public void run() {
            System.out.println(new Date());
        }
    }
}
