package study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by sould on 2016-05-04.
 */
public class RunnableTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main method.");

        Runnable r = new ConcreateRunnable();
        List<Thread> threadList = new ArrayList<Thread>();

        for(int i=0; i<10; i++){
            //Runnable 인터페이스를 사용해 새로운 쓰레드를 만든다.
            Thread test = new Thread(r);
            test.start();                   // 스레드 실행
            threadList.add(test);           // 생성한 쓰레드를 리스트에 삽입
        }

        for(Thread t : threadList){
            t.join();
        }

        System.out.println("End main method.");
    }
}

class ConcreateRunnable implements Runnable{

    private int index = 0;

    @Override
    public void run() {
        Random r = new Random(System.currentTimeMillis());
        long s = r.nextInt(3000);   // 3초
        try{
            Thread.sleep(s);        // Thread 멈춤
        }catch (InterruptedException e){e.printStackTrace();}
        addIndex();
    }

    synchronized void addIndex(){
        index++;
        System.out.println("current index value : "+index);
    }
}

