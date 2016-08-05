package study.lambda;

import java.util.Arrays;

/**
 * Created by sould on 2016-05-04.
 */
public class Stream {

    public static void main(String[] args) {
        Arrays.asList(1,2,3).stream();          // 일반적
        Arrays.asList(1,2,3).parallelStream();  // 병렬Stream

        Arrays.asList(1,2,3).stream()
                .forEach(System.out::println);
    }
}
