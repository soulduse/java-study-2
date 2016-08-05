package study.thread.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by sould on 2016-06-30.
 */
public class ThreadSemaphore implements Runnable {

    private Semaphore smp;
    private String msg;

    public ThreadSemaphore(Semaphore se){
        this.smp = se;
    }

    public ThreadSemaphore(Semaphore se, String st){
        this.smp = se;
        this.msg = st;
    }

    @Override
    public void run() {
        try{
            smp.acquire();  // acquire() 로 묶음
            System.out.println("Msg : "+msg);
            Thread.sleep(1000*10);
            smp.release();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
