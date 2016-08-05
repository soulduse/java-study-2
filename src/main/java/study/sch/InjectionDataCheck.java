package study.sch;

/**
 * Created by sould on 2016-06-07.
 */
public class InjectionDataCheck {

    private static String prevBroadName = null;

    public static void main(String[] args) throws InterruptedException{
        String name = "hello";

        System.out.println(prevBroadName);


        while(true){
            int ramdom = (int)(Math.random()*2)+1;
            String inputStr = name+ramdom;
            System.out.println("---------------------------------");
            System.out.println("input : "+inputStr);
            input(inputStr);
            System.out.println("output : "+prevBroadName);
            Thread.sleep(2000);
        }
    }

    private static void input(String msg){
        if(prevBroadName == null){
            prevBroadName = msg;
        }else if(msg.equals(prevBroadName)){
            System.out.println("데이터가 같다.");
        }else if(!msg.equals(prevBroadName)){
            System.out.println("데이터가 다르다. : "+prevBroadName);
            prevBroadName = msg;
        }
    }
}
