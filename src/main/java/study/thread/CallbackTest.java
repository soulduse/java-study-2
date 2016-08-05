package study.thread;

import java.util.concurrent.Callable;

/**
 * Created by sould on 2016-08-05.
 */
public class CallbackTest {



    public static void main(String[] args) throws Exception {
        CallbackTest callbackTest = new CallbackTest();
        System.out.println(callbackTest.init());
    }


    private String init()throws Exception{
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                return "hello world!";
            }
        };

        String a = (String)callable.call();
        return a;

    }
}
