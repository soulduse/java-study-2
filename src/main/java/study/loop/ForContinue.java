package study.loop;

/**
 * Created by sould on 2016-05-27.
 */
public class ForContinue {

    public static void main(String[] args) throws InterruptedException{


        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i+"AA");
            Thread.sleep(1000);
        }

    }
}
