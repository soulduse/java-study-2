package study.date;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sould on 2016-07-12.
 */
public class CompareData {

    private List<TempData> tempDataList = null;
    private TempData td = null;

    private void init(){
        tempDataList = new ArrayList<>();
        td = new TempData();
        td.setDuration(10);
        td.setFrame(1);
        tempDataList.add(td);

        td = new TempData();
        td.setDuration(10);
        td.setFrame(1);
        tempDataList.add(td);

        td = new TempData();
        td.setDuration(10);
        td.setFrame(1);
        tempDataList.add(td);

        td = new TempData();
        td.setDuration(15);
        td.setFrame(2);
        tempDataList.add(td);

        td = new TempData();
        td.setDuration(10);
        td.setFrame(3);
        tempDataList.add(td);

    }

    private void printer(){
        int[] iarr = new int[999];

        for(int i=0; i<tempDataList.size(); i++){
            iarr[tempDataList.get(i).getFrame()] += tempDataList.get(i).getDuration();
        }

        for(int i = 0; i <tempDataList.size(); i++) {
            if(iarr[i] != 0) {
                System.out.println("duration : " + iarr[i] + " / frame : " + i);
            }
        }
    }

    private List<Integer> print() {
        List<Integer> listItem = new ArrayList<>();
        for(int i=0; i<tempDataList.size()-2;i++){
            int frame = tempDataList.get(i).getFrame();
            int duration = tempDataList.get(i).getDuration();
            if(tempDataList.get(i+1).getFrame() == tempDataList.get(i+2).getFrame()){
                duration += (tempDataList.get(i).getDuration()+tempDataList.get(i+1).getDuration());
            }else{
                frame = tempDataList.get(i+2).getFrame();
                duration = tempDataList.get(i+2).getDuration();
            }
//            System.out.println("duration : "+duration+" / frame : "+frame);
            listItem.add(duration);
        }

        return listItem;
    }


    public static void main(String[] args) {
        CompareData compareData = new CompareData();
        compareData.init();
        compareData.printer();
//        System.out.println(compareData.print().size());

//        for(int i=0; i<compareData.print().size();i ++){
//            int result = compareData.print().get(i);
//            System.out.println(result);
//        }
    }
}

class TempData{
    private int frame;
    private int duration;

    public int getFrame() {
        return frame;
    }

    public void setFrame(int frame) {
        this.frame = frame;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}


//
//    private void print(){
//        int durationTemp = 0;
//        int frameTemp    = 0;
//        System.out.println("==================================================");
//        for(int i=0; i<tempDataList.size(); i++){
//            int duration = tempDataList.get(i).getDuration();
//            int frame = tempDataList.get(i).getFrame();
//            System.out.println("duration : "+duration+" / frame : "+frame);
//        }
//        System.out.println("==================================================");
//        for(int i=0; i<tempDataList.size(); i++){
//            if(durationTemp == 0 && frameTemp == 0){
//                durationTemp = tempDataList.get(i).getDuration();
//                frameTemp    = tempDataList.get(i).getFrame();
//            }else{
//                if(frameTemp == tempDataList.get(i).getFrame()){
//                    durationTemp += tempDataList.get(i).getDuration();
//                }
//                else{
//                    frameTemp = tempDataList.get(i).getFrame();
//                    durationTemp = 0;
//                    durationTemp += tempDataList.get(i).getDuration();
//                }
//            }
//            System.out.println("duration : "+durationTemp+" / frame : "+frameTemp);
//        }
//    }