package study.annotation;

import java.lang.reflect.Method;

/**
 * Created by sould on 2016-07-15.
 */
public class MyHelloExam {

    public static void main(String[] args) {
        MyHello myHello = new MyHello();
        try {
            Method method = myHello.getClass().getDeclaredMethod("hello");
            if(method.isAnnotationPresent(Count100.class)){
                for(int i=0; i<100; i++){
                    myHello.hello();
                }
            }else{
                myHello.hello();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
