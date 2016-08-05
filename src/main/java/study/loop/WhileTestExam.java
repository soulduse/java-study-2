package study.loop;

/**
 * Created by sould on 2016-07-26.
 */
public class WhileTestExam {
    public static void main(String[] args) throws Exception{
        int cnt = 0;
        while (cnt !=10){

            Thread.sleep(1000);
            int ran = (int)((Math.random()*5));
            System.out.println("hello~ cnt value = "+ran);
            if(ran == 3){
                cnt ++;
            }
        }
    }
}
