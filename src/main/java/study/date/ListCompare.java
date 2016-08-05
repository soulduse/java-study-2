package study.date;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-04-19.
 */
public class ListCompare {

    public static void main(String[] args) {
        exam02();
    }

    private static void exam01(){
        List<String>list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        List<String>list2 = new ArrayList<String>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");


        System.out.println(list1.containsAll(list2));

        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
    }

    private static void exam02(){
        List<Member>list1 = new ArrayList<Member>();
        Member member1 = new Member();
        member1.setName("홍길동");
        member1.setAge(30);
        list1.add(member1);

        List<Member>list2 = new ArrayList<Member>();
        Member member2 = new Member();
        member2.setName("홍길동");
        member2.setAge(30);
        list2.add(member2);


        System.out.println(list1.containsAll(list2));

        for(int i=0; i<list1.size(); i++){
            System.out.println("name : "+list1.get(i).getName()+" / age : "+list1.get(i).getAge());
        }
    }


    static class Member{
        private String name;
        private int age;

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
