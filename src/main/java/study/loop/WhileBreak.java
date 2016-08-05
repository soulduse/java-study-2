package study.loop;

/**
 * Created by sould on 2016-07-27.
 */
public class WhileBreak {
    public static void main(String[] args) throws Exception{

        run(1);
    }

    private static void run(int val)throws Exception{
        int cnt = 0;
        switch (val){
            case 1: {
                while(true){
                    if(cnt == 5)
                        break;
                    System.out.println("cnt : "+cnt);
                    Thread.sleep(1000);
                    cnt++;
                    continue;
                }
                System.out.println("end");
                break;
            }
        }
    }
}
