package study.thread;

/**
 * Created by sould on 2016-05-24.
 */
public class ThreadValueLock {

    int cnt = 0;
    boolean netState = false;
    boolean lock = false;

    private void threadStart(){


        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true){
                    try{
                        if(cnt%3 == 0){
                            netState = true;
                            lock=true;
                        }else if(cnt%5 == 0){
                            netState = false;
                            lock=false;
                        }

                        if(netState&&lock){
                            lock = false;
                            System.out.println(cnt+" : "+netState);
                        }else if(!netState && !lock){
                            lock = true;
                            System.out.println(cnt+" : "+netState);
                        }
                        Thread.sleep(1000);
                        cnt++;
                    }catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                }

            }
        };

        Thread thread = new Thread(r);
        thread.start();
    }


    public static void main(String[] args) {
        ThreadValueLock tvl = new ThreadValueLock();
        tvl.threadStart();
    }



}
