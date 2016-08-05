package study.loop;

/**
 * Created by sould on 2016-05-30.
 */
public class loopPrint {


    public static void main(String[] args) throws InterruptedException{
        boolean flag = false;
        int cnt =0;
        while(true){

            cnt++;
            System.out.println("cnt : "+cnt);
            if(cnt >= 5) {
                flag = true;
                cnt = 0;
            }else{
                flag = false;
            }
            if(flag){
                System.out.println("wow");
            }

            Thread.sleep(1000);
        }
    }



}
