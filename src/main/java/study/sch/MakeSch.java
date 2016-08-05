package study.sch;

/**
 * Created by sould on 2016-07-06.
 */
public class MakeSch {

    private final int [] TIMES = {5, 10, 5};

    public static void main(String[] args) {
        MakeSch ms = new MakeSch();
        ms.schTimeTest();
    }

    private void schTimeTest(){

        int totalTime   = getTotalTime();
        int temp = 0;

        while(true){
            try{
                int currentTime = (int)getCurrentTime();
                int result = currentTime%totalTime;
                print("result : "+result+" / total : "+totalTime);
                for(int i=0; i<TIMES.length; i++){
                    if(temp <= result && result <TIMES[i]){

                    }
                }
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }

    }

    private int getTotalTime(){
        int totalTime = 0;
        for(int i=0; i<TIMES.length; i++){
            totalTime += TIMES[i];
        }
        return totalTime;
    }

    private long getCurrentTime(){
        return System.currentTimeMillis()/1000;
    }

    private void print(String msg){
        System.out.println(msg);
    }
}
