package study.lambda;

import java.util.stream.IntStream;

/**
 * Created by sould on 2016-05-09.
 */
public class LambdaExam02 {

    public static void main(String[] args) {
        System.out.println(isPrimeBeforeJava8(3));
        System.out.println(isPrimeAfterjava8(3));

    }

    static boolean isPrimeBeforeJava8(int number){
        if(number <= 1){
            return false;
        }

        for(int i=2; i<number; i++){
            if((number % i) == 0){
                return false;
            }
        }

        return true;
    }

    static boolean isPrimeAfterjava8(int number){
        return number > 1 && IntStream.range(2, number).noneMatch( index -> number % index == 0);
    }


}
