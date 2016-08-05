package study.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-07-26.
 */
public class ArrayCopyExam {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();

    }


    class Person{
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
