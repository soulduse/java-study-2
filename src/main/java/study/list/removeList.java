package study.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-05-23.
 */
public class removeList {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        printList(list);
        for(int i=list.size()-1; i>=0; i--){
            list.remove(i);
        }
        printList(list);
    }

    private static void printList(List list){
        System.out.println("listSize : "+list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(i);
        }
        System.out.println("-----------------------");
    }

}
