package study.loop;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sould on 2016-05-09.
 */
public class ForBreak {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        study.list.stream().filter((Integer i)-> i==3).forEach((Integer i) -> System.out.println(i));
//        study.list.forEach((Integer i) -> System.out.println(i));


        System.out.println("결과 : "+getListInteger(list));

    }


    private static int getListInteger(List<Integer> list){
        int result = 0;

        for(int i=0; i<list.size(); i++){
            if(list.get(i) == 3){
                result = list.get(i);
                break;
            }
            System.out.println(list.get(i));
        }

        return result;
    }
}
