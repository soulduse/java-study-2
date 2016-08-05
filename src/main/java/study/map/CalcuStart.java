package study.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by sould on 2016-08-02.
 */
public class CalcuStart {

    private CalcuData calcuData;
    private ArrayList<CalcuData> calcuDataList;
    private String tempName;

    public CalcuStart(){
        calcuData = new CalcuData();
    }

    public static void main(String[] args) {
        CalcuStart calcuStart = new CalcuStart();
        calcuStart.init();
        calcuStart.addData();
        calcuStart.print();

        System.out.println("==========================================");
        List<CalcuData> resultList = calcuStart.calcu();
        for(int i=0; i<resultList.size(); i++){
            String name = resultList.get(i).getName();
            int age = resultList.get(i).getAge();
            int total = resultList.get(i).getTotal();

            System.out.println("name : "+name+" / age : "+age+" / total : "+total);
        }
    }

    private void init(){
        calcuDataList = new ArrayList<>();
    }

    private void print(){
        for(int i=0; i<calcuDataList.size(); i++){
            String name = calcuDataList.get(i).getName();
            int age = calcuDataList.get(i).getAge();

            System.out.println("name : "+name+" / age :"+age);
        }
    }


//    private List<CalcuData> calcu(){
//        for(int i=0; i<calcuDataList.size(); i++){
//            String name = calcuDataList.get(i).getName();
//            int totalAge = calcuDataList.stream()
//                    .filter(x-> x.getName().equals(name))
//                    .mapToInt(x->x.getAge()).sum();
//            calcuDataList.get(i).setTotal(totalAge);
//        }
//        return calcuDataList;
//    }



    private List<CalcuData> calcu(){
        for(int i=0; i<calcuDataList.size(); i++){
            tempName = calcuDataList.get(i).getName();
            int totalAge = 0;

            Iterator iter = calcuDataList.iterator();
            while (iter.hasNext()){
                CalcuData calcuData = (CalcuData)iter.next();
                String schName = calcuData.getName();
                int age        = calcuData.getAge();
                if(tempName.equals(schName)){
                    totalAge += age;
                }
            }
            calcuDataList.get(i).setTotal(totalAge);
            System.out.println(totalAge);
        }
        return calcuDataList;
    }

    private void addData(){
        calcuData = new CalcuData();
        calcuData.setName("AAA");
        calcuData.setAge(10);
        calcuDataList.add(calcuData);
        calcuData = new CalcuData();
        calcuData.setName("AAA");
        calcuData.setAge(20);
        calcuDataList.add(calcuData);
        calcuData = new CalcuData();
        calcuData.setName("BBB");
        calcuData.setAge(30);
        calcuDataList.add(calcuData);
        calcuData = new CalcuData();
        calcuData.setName("BBB");
        calcuData.setAge(10);
        calcuDataList.add(calcuData);
        calcuData = new CalcuData();
        calcuData.setName("BBB");
        calcuData.setAge(20);
        calcuDataList.add(calcuData);
        calcuData = new CalcuData();
        calcuData.setName("CCC");
        calcuData.setAge(50);
        calcuDataList.add(calcuData);
        calcuData = new CalcuData();
        calcuData.setName("DDD");
        calcuData.setAge(15);
        calcuDataList.add(calcuData);
    }
}
