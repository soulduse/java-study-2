package study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by sould on 2016-05-04.
 */
public class ThreadTest2 extends Thread{

    private static int index = 0;

    private int id = -1;
    public ThreadTest2(int id){
        this.id = id;
    }

    public void run(){
        System.out.println(id+"번 쓰레드 동작 중...");
        Random r = new Random(System.currentTimeMillis());
        try{
            long s = r.nextInt(3000);
            Thread.sleep(s);
            addIndex();
        }catch (InterruptedException e){e.printStackTrace();}

        System.out.println(id+"번 쓰레드 동작 종료...");
    }

    public synchronized static void addIndex(){
        index++;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main method.");
        List<Thread> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            ThreadTest2 test = new ThreadTest2(i);
            test.start();
            list.add(test);
        }

        for(Thread t : list){
            t.join();
        }

        System.out.println("current Index : "+index);
        System.out.println("End main method.");
    }
}
