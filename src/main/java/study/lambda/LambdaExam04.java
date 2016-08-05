package study.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sould on 2016-05-09.
 */
public class LambdaExam04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","D","1","2","3");
        String compareStr = "A";
        System.out.println(list.stream().filter(compareStr::equals));
        System.out.println(list.stream().filter(str -> compareStr.equals(str)));

        Func func = (int a, int b)->{return a>b ? a:b;};
    }
}
