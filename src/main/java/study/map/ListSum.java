package study.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sould on 2016-08-08.
 */
public class ListSum {

    private List<Person> itemList1;
    private List<Person> itemList2;
    private Map<String, List<Person>> itemMap;
    private Person person;

    public static void main(String[] args) {
        ListSum listSum = new ListSum();
        listSum.initAdd();
        listSum.print();
        listSum.listSum();
    }

    private void initAdd(){
        itemList1 = new ArrayList<>();
        itemList2 = new ArrayList<>();

        person   = new Person();
        person.setName("홍길동");
        person.setAge(200);
        itemList1.add(person);

        person   = new Person();
        person.setName("김현우");
        person.setAge(28);
        itemList1.add(person);

        person   = new Person();
        person.setName("이정재");
        person.setAge(35);
        itemList2.add(person);
    }

    private void listSum(){
        itemList1.addAll(itemList2);
        for(int i=0; i<itemList1.size(); i++){
            System.out.println();
            System.out.println("resultListValue : "+itemList1.get(i).getName() + " / "+itemList1.get(i).getAge());
        }

    }


    private void print(){
        for(int i=0; i<itemList1.size(); i++){
            System.out.println("list1 : "+itemList1.get(i).getName()+" / "+itemList1.get(i).getAge());
        }
        for(int i=0; i<itemList2.size(); i++){
            System.out.println("list2 : "+itemList2.get(i).getName()+" / "+itemList2.get(i).getAge());
        }
    }


    class Person{
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
