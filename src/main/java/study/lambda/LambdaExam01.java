package study.lambda;

/**
 * Created by sould on 2016-05-04.
 */
public class LambdaExam01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World.");
            }
        }).start();


        new Thread(()->{
            System.out.println("Hello World.");
        }).start();

        Func add = (int a, int b) -> a+b;
        Func add2 = (int a, int b) -> {return a+b;};
        Func sub = (int a, int b) -> a-b;

        int result = add.calc(1,2) + add2.calc(3,4) + sub.calc(1, 10);
        System.out.println(result);
    }



}
