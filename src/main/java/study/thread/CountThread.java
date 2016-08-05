package study.thread;

/**
 * Created by sould on 2016-05-19.
 */
public class CountThread {

    private Runnable runnable;
    private Thread   cntThread;

    public static void main(String[] args) {
        CountThread countThread = new CountThread();

        countThread.runnable = new Runnable() {
            int cnt = 0;
            @Override
            public void run() {
                while(cnt<10){
                    System.out.println(cnt);
                    cnt++;
                }
            }
        };

        countThread.cntThread = new Thread(countThread.runnable);
        countThread.cntThread.start();
    }



}
