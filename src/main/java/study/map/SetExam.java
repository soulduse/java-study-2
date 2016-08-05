package study.map;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sould on 2016-07-22.
 */
public class SetExam {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(1);

        while(set.iterator().hasNext()){
            System.out.println(set.iterator().next());
        }
    }
}
