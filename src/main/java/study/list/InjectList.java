package study.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sould on 2016-05-27.
 */
public class InjectList {


    private static List<Integer> list1;
    private static List<Integer> list2;

    public static void main(String[] args) {
        list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        printList(list2);
        list1 = list2;
        System.out.println("-------------------------------");
        printList(list1);
    }

    private static void printList(List<Integer> listItems){
        listItems.stream().forEach(System.out::println);
    }
}
