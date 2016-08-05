package study.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-07-01.
 */
public class ListClearTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        DataList dataList = new DataList();
        Data data = new Data();
        list.add(1);
        list.add(2);
        list.add(3);
        data.setList(list);

//        dataList.setDataList(data);
        list.clear();

        data = new Data();
        list.add(4);
        list.add(5);
        list.add(6);
        data.setList(list);
        list.clear();

        data = new Data();
        list.add(7);
        list.add(8);
        list.add(9);
        data.setList(list);
//        study.list.clear();

        System.out.println("================ Test-A =================");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("================ Test-B =================");
        for(int i=0; i<data.getList().size(); i++){
            System.out.println(data.getList().get(i));
        }
    }


    static class Data{
        List<Integer> list;

        public List<Integer> getList() {
            return list;
        }

        public void setList(List<Integer> list) {
            this.list = list;
        }
    }

    static class DataList{
        List<Data> dataList;

        public List<Data> getDataList() {
            return dataList;
        }

        public void setDataList(List<Data> dataList) {
            this.dataList = dataList;
        }
    }
}
