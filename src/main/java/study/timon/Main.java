package study.timon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 29.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class Main {

    private static List<Beverage> beverageList;
    private static Beverage beverage;

    public static void main(String[] args) throws Exception{
        initData();

        Runnable runnable = () -> {
            int count = 0;
            try{
                for (Beverage b : beverageList){
                    for(int i=0; i<b.getCnt(); i++){
                        System.out.println(b.getName()+" 만드는 중 ...");
                        count++;
                        Thread.sleep(1000);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });

//        Thread thread = new Thread(runnable);
//        thread.start();

        try {
            System.out.println("attempt to shutdown executor");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        }
        finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }


        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());

        Integer result = future.get();

        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + result);
    }


    static Callable<Integer> task = () -> {
        try {
            TimeUnit.SECONDS.sleep(1);
            return 123;
        }
        catch (InterruptedException e) {
            throw new IllegalStateException("task interrupted", e);
        }
    };

    private static void initData(){
        beverageList = new ArrayList<>();
        beverage = new Beverage();
        beverage.setCnt(1);
        beverage.setName("espresso");
        beverageList.add(beverage);
        beverage = new Beverage();
        beverage.setCnt(2);
        beverage.setName("americano");
        beverageList.add(beverage);
        beverage = new Beverage();
        beverage.setCnt(1);
        beverage.setName("juice");
        beverageList.add(beverage);
        beverage = new Beverage();
        beverage.setCnt(4);
        beverage.setName("caffelatte");
        beverageList.add(beverage);
        beverage = new Beverage();
        beverage.setCnt(2);
        beverage.setName("espresso");
        beverageList.add(beverage);
    }
}
