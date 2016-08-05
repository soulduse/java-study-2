package study.sch;

import study.sch.data.Template;
import study.sch.data.Schedule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-07-01.
 */
public class SchRepeatTest {

    private List<Schedule> schList;
    private List<Template> tempList;

    private Schedule schData;
    private Template tempData;

    public SchRepeatTest(){
        initData();
    }


    private void initData(){
        schList         = new ArrayList<Schedule>();
        tempList        = new ArrayList<Template>();

        injectionData("aaa", "A컨텐츠", 5, "a0000");
        injectionData("bbb", "B컨텐츠", 10, "a0000");
        injectionData("ccc", "C컨텐츠", 5, "a0000");
        injectionData("ddd", "D컨텐츠", 15, "a0000");
        injectionData("eee", "E컨텐츠", 20, "a0000");

        schData         = new Schedule();
        schData.setOrder(1);
        schData.setSchName("a0000");
        for(int i=0; i<tempList.size(); i++){
            schData.getTemplateList().add(tempList.get(i));
        }
        schData.setTime(getTotalTime(schData.getSchName()));
        schList.add(schData);
        tempList.clear();

        injectionData("fff", "A동영상", 3, "b0000");
        injectionData("ggg", "B동영상", 10, "b0000");
        injectionData("hhh", "C동영상", 3, "b0000");
        injectionData("iii", "D동영상", 10, "b0000");
        injectionData("jjj", "E동영상", 5, "b0000");

        schData         = new Schedule();
        schData.setOrder(2);
        schData.setSchName("b0000");
        for(int i=0; i<tempList.size(); i++){
            schData.getTemplateList().add(tempList.get(i));
        }
        schData.setTime(getTotalTime(schData.getSchName()));
        schList.add(schData);
        tempList.clear();

        injectionData("00123A", "AImage", 5, "c0000");
        injectionData("00123B", "BImage", 5, "c0000");
        injectionData("00123C", "CImage", 5, "c0000");
        injectionData("00123D", "DImage", 15, "c0000");
        injectionData("00123E", "EImage", 15, "c0000");

        schData         = new Schedule();
        schData.setOrder(3);
        schData.setSchName("c0000");
        for(int i=0; i<tempList.size(); i++){
            schData.getTemplateList().add(tempList.get(i));
        }
        schData.setTime(getTotalTime(schData.getSchName()));
        schList.add(schData);
        tempList.clear();

        print(schList);
        System.out.println(schList.size());
    }

    public List<Schedule> getData(){
        return schList;
    }

    private int getTotalTime(String schName){
        int total = 0;
        for(int i=0; i<schData.getTemplateList().size(); i++){
            if(schName.equals(schData.getSchName()))
                total += schData.getTemplateList().get(i).getDuration();
        }

        return total;
    }

    private void injectionData(String tpName, String content, int duration, String schName){
        tempData = new Template();
        tempData.setTpName(tpName);
        tempData.setContent(content);
        tempData.setDuration(duration);
        tempData.setSchName(schName);
        tempList.add(tempData);
    }

    private void print(List<Schedule> schList){
        for(int i=0; i<schList.size(); i++){
            System.out.println("==================== [[Schedule]] ====================");
            System.out.println("> schName     : "+schList.get(i).getSchName());
            System.out.println("> totalTime   : "+schList.get(i).getTime());
            System.out.println("> order       : "+schList.get(i).getOrder());
            System.out.println("=========================================================");

            for(int j=0; j<schList.get(i).getTemplateList().size(); j++){
                System.out.println("---------------------- Template -------------------------");
                System.out.println("schName  : "+schList.get(i).getTemplateList().get(j).getSchName());
                System.out.println("duration : "+schList.get(i).getTemplateList().get(j).getDuration());
                System.out.println("tpName   : "+schList.get(i).getTemplateList().get(j).getTpName());
                System.out.println("content  : "+schList.get(i).getTemplateList().get(j).getContent());
            }
        }
    }

//    public static void main(String[] args) {
//        SchRepeatTest srt = new SchRepeatTest();
//        srt.initData();
//    }
}
