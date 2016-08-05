package study.thread;

/**
 * Created by sould on 2016-04-21.
 */
public class ThreadTest {

    private Thread              mThread = null;
    private ThreadClass     threadClass = null;
    private static boolean   threadStop = false;

    public static void main(String[] args) {
        ThreadTest mainClass = new ThreadTest();
        mainClass.threadInit();
        while(!threadStop){
            try{
                Thread.sleep(1000);
                System.out.println("반복");
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        System.out.println("ThreadIsAlive >> "+mainClass.threadIsAlive());
    }


    private void threadInit(){
        threadClass = new ThreadClass();
        mThread = new Thread(threadClass);
        mThread.start();
    }

    private boolean threadIsAlive(){
        return mThread.isAlive();
    }

    private void threadInterrupt(){
        mThread.interrupt();
        threadStop = true;
    }

    private

    class ThreadClass implements Runnable{

        private int cnt = 0;

        @Override
        public void run() {
            try{
                while (!mThread.interrupted()){
                    Thread.sleep(1000);
                    System.out.println("헬로우");
                    if(cnt%5 == 0){
                        System.out.println("Thread State : "+threadIsAlive());
                    }
                    if(cnt == 11){
                        threadInterrupt();
                    }
                    cnt++;
                }
            }catch (Exception e){e.printStackTrace();}
        }
    }
}
