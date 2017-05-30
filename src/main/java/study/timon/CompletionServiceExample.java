package study.timon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 29.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class CompletionServiceExample extends Thread{


    private static List<Beverage> beverageList;
    private static Beverage beverage;
    private static final String TEXT_ESPRESSO    = "espresso";
    private static final String TEXT_AMERICANO   = "americano";
    private static final String TEXT_JUICE       = "juice";
    private static final String TEXT_CAFFELATTE  = "caffelatte";

    private static final int TIME_ESPRESSO    = 2;
    private static final int TIME_AMERICANO   = 3;
    private static final int TIME_JUICE       = 5;
    private static final int TIME_CAFFELATTE  = 4;

    private static final int SECOND           = 1000;

    private static final String BARISTA_A = "pool-1-thread-1";
    private static final String BARISTA_B = "pool-1-thread-2";
    private static final String BARISTA_C = "pool-1-thread-3";
    private static final String BARISTA_D = "pool-1-thread-4";


    public static void main(String[] args){
        // 데이터 주입
        initData();

        // 스레드풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // CompletionService 생성
        CompletionService<Beverage> completionService =
                new ExecutorCompletionService<Beverage>(executorService);

        System.out.println("[작업 처리 요청]");

        for(Beverage b : beverageList) {

            Callable<Beverage> task = new Callable<Beverage>() {
                @Override
                public Beverage call() throws Exception {
                    // Code
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
//                    System.out.println("[총 스레드 개수: " + poolSize + "] 작업 스레드 이름: " + threadName);

                    System.out.println("음료 : "+b.getName()+" / 개수 : "+b.getCnt());

                    for(int i=0; i<b.getCnt(); i++){
                        String name = b.getName();

                        int time = 0;

                        if(name.equals(TEXT_ESPRESSO)){
                            time = TIME_ESPRESSO;
                        }else if(name.equals(TEXT_AMERICANO)){
                            if(threadName.equals(BARISTA_B))
                                time = 4;
                            else
                                time = TIME_AMERICANO;
                        }else if(name.equals(TEXT_JUICE)){
                            if(threadName.equals(BARISTA_A))
                                time = 4;
                            else
                                time = TIME_JUICE;
                        }else if(name.equals(TEXT_CAFFELATTE)){
                            if(threadName.equals(BARISTA_D))
                                time = 5;
                            else
                                time = TIME_CAFFELATTE;
                        }
                        System.out.println(threadName+" --> "+name+" 만드는 중 / 소요시간 : "+time+"초");
                        Thread.sleep(SECOND * time);
                    }
                    return b;
                }
            };

            completionService.submit(task);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){
            try{
                Future<Beverage> future = completionService.take();
                Beverage beverage = future.get();
                System.out.println("[처리 결과] " + beverage.getName()+" / "+beverage.getCnt()+" 잔 제조 완료 ");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
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