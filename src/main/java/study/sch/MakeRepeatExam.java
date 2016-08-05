package study.sch;

/**
 * Created by sould on 2016-05-02.
 */
public class MakeRepeatExam {

    static boolean playLock = false;

    public static void main(String[] args) {
        // 컨텐츠 재생시간(sec)
        int contentRepeatTimeArr[] = {10, 5, 5, 3};
        int sum = 0;

        for(int i=0; i<contentRepeatTimeArr.length; i++){
            // 총 시간을 더한다.
            sum += contentRepeatTimeArr[i];
        }

//        while(System.currentTimeMillis()/1000<1462246206){
        while(true){
            try{
                long curretnTime = System.currentTimeMillis()/1000;
                long result = curretnTime%sum;
//                System.out.println("sun : "+sum+ " / currentTime : "+curretnTime);
                System.out.println("result : "+result);
                changeContent(result, contentRepeatTimeArr);
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void changeContent(long result, int[] contentTime){
        int temp = 0;
        int cnt = 0;
        for(int i=0; i<contentTime.length; i++)
        {

            if(cnt == result){
                playLock = false;
            }
            cnt += contentTime[i];
            System.out.println("result : "+result+" / time : "+cnt);
            if(temp<=result && result<cnt && !playLock){
                playLock = true;
                System.out.println(">> "+(i+1)+"번 컨텐츠 실행");
            }
            temp += contentTime[i];
        }
    }

}
