package study.string;

/**
 * Created by sould on 2016-05-23.
 */
public class StringEquals {

    static String a ="aaa";
    static String fix = "aaa";

    public static void main(String[] args) {

        if(a.length()<=0 || fix.length()<=0){
            System.out.println("빈값이 있다!");
        }else{
            if(!a.equals("aaa")||!fix.equals("aaa")){
                System.out.println("값의 변경이 있음");
            }
            System.out.println("정상!");
        }

    }
}
