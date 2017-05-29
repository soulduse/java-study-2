package study.timon;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 29.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class CallbackExample {
    private ExecutorService executorService;

    public CallbackExample(){
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }

    // 콜백 메소드를 가진 CompletionHandler 객체 생성. Integer : 결과 타입, Void : 첨부 타입
    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>(){
        @Override
        public void completed(Integer result, Void attachment){
            System.out.println("completed() 실행 : " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment){
            System.out.println("failed() 실행 : " + exc.toString());
        }

    };

    public void doWork(final String x, final String y){

        // 작업을 정의
        Runnable task = new Runnable(){
            @Override
            public void run(){
                try{
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    callback.completed(result, null);
                }catch(NumberFormatException e){
                    callback.failed(e, null);
                }
            }
        };

        // 스레드풀에게 작업 요청
        executorService.submit(task);

    }

    public void finish(){
        executorService.shutdown(); // 스레드풀 종료
    }

    public static void main(String[] args){
        CallbackExample example = new CallbackExample();
        example.doWork("3", "3");
        example.doWork("3", "삼");
        example.finish();
    }
}
