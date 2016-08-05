package study.lambda;

/**
 * Created by sould on 2016-05-04.
 */
@FunctionalInterface
public interface Func {
    public int calc(int a, int b);
    public default String getString(){
        return "Hello";
    }

    public static boolean isEmpty(String str){
        if(str == null || str.length() <= 0){
            return false;
        }else{
            return true;
        }
    }

}
