package study.timon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 29.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class NoResultExample {

    private static List<Beverage> beverageList;
    private static Beverage beverage;

    public static void main(String[] args){

        initData();

        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        System.out.println("[작업 처리 요청]");

        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                int sum = 0;
                for(int i=1; i<=10; i++){
                    sum += i;
                }
                System.out.println("[처리 결과] " + sum);
            }
        };

        Future future = executorService.submit(runnable);

        try{
            future.get();
            System.out.println("[작업 처리 완료]");
        }catch(Exception e){
            System.out.println("[실행 예외 발생] " + e.getMessage());
        }

        executorService.shutdown(); // 작업 큐에 대기하고 있는 모든 작업을 처리한 뒤에 스레드풀을 종료

    }

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
