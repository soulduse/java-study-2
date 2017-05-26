package study.datastructure;

import java.util.LinkedList;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 25.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class TestLinked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
