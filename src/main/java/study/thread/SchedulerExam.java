package study.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by sould on 2016-07-25.
 */
public class SchedulerExam {
    private final ScheduledExecutorService jobScheduler = Executors.newScheduledThreadPool(2);
    private final int CONTENTS_DOWN_CHECK = 1;
    private final int CONTENTS_DOWN_NEXT  = 2;
    private final String NEW_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private final String DAY_DATE_FORMAT = "yyyy-MM-dd";
    private String msg = null;
    private boolean flag = true;

    public static void main(String[] args) {
        SchedulerExam se = new SchedulerExam();
        se.excutorInit();
    }


    private void excutorInit() {
        excutorStart(CONTENTS_DOWN_NEXT);
        excutorStart(CONTENTS_DOWN_CHECK);
    }

    private void excutorStart(int condition) {
        if (condition == CONTENTS_DOWN_CHECK) {  	// 매일 오후 11:59:59 체크
            jobScheduler.scheduleAtFixedRate(excutorScheduler(condition), 0, 60 * 1000, TimeUnit.MILLISECONDS);
        }
        else if (condition == CONTENTS_DOWN_NEXT) {	// 매일 오후 11:00:00 체크
            jobScheduler.scheduleAtFixedRate(excutorScheduler(condition), 0, 5 * 1000, TimeUnit.MILLISECONDS);
        }
    }

    public void excutorStop() {
        if (!jobScheduler.isShutdown())
            jobScheduler.shutdownNow();
    }

    private Runnable excutorScheduler(final int condition) {
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    switch (condition) {
                        case CONTENTS_DOWN_CHECK:{
                            while (msg == null){
                                Thread.sleep(1000);
                                continue;
                            }
                            System.out.println("One Play~~~!");
                            break;
                        }
                        case CONTENTS_DOWN_NEXT:{
                            System.out.println("Two Play@@@@");
                            flag = !flag;
                            if(flag)
                                msg = "hello";
                            else
                                msg = null;

                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        return runnable;
    }

    public long getMaxToday(String time){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(DAY_DATE_FORMAT);
        SimpleDateFormat changeFormat = new SimpleDateFormat(NEW_DATE_FORMAT);
        String maxToday = sdf.format(date)+" "+time;
        try{
            date = changeFormat.parse(maxToday);
        }catch (ParseException pe){
            pe.printStackTrace();
        }
        return date.getTime();
    }
}
