package study.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by soul on 2016. 12. 21..
 *
 * Java8 is expected to change the way programmers code their programs.
 * For a brief comparison between Java 7 and Java 8, let us see a sorting
 * program written with both Java 7 and java 8 syntaxes.
 *
 */
public class Overview01 {

    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Mahesh ");
        names1.add("Dave ");
        names1.add("Eva ");
        names1.add("Kurt ");
        names1.add("Kalpesh ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Mahesh ");
        names2.add("Dave ");
        names2.add("Eva ");
        names2.add("Kurt ");
        names2.add("Kalpesh ");

        Overview01 overview01 = new Overview01();
        System.out.println("Sort using Java 7 syntax : ");

        overview01.sortUsingJava7(names1);
        System.out.println(names1);
        System.out.println("Sort using Java 8 syntax : ");

        overview01.sortUsingJava8(names2);
        System.out.println(names2);
    }

    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
