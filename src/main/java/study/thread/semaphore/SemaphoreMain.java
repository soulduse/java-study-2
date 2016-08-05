package study.thread.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by sould on 2016-06-30.
 */
public class SemaphoreMain {

    public static void main(String[] args) {
        Semaphore se = new Semaphore(1);
        ThreadSemaphore semaphore1 = new ThreadSemaphore(se, "첫번째 스레드");
        ThreadSemaphore semaphore2 = new ThreadSemaphore(se, "두번째 스레드");
        ThreadSemaphore semaphore3 = new ThreadSemaphore(se, "세번째 스레드");
        ThreadSemaphore semaphore4 = new ThreadSemaphore(se, "네번째 스레드");

        Thread th1 = new Thread(semaphore1);
        Thread th2 = new Thread(semaphore2);
        Thread th3 = new Thread(semaphore3);
        Thread th4 = new Thread(semaphore4);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }

}

