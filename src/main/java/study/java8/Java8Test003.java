package study.java8;

/**
 * Created by soul on 2016. 12. 23..
 */
public class Java8Test003 {
    final static String salutation = "Hello!";

    public static void main(String[] args) {
        GreetingService greetingService = messsage ->
                System.out.println(salutation+messsage);
        greetingService.sayMessage("Dave");
        isddd("ABCDE");
    }

    interface GreetingService{
        void sayMessage(String messsage);
    }

    static boolean isddd(String word){
        try{
            String reverseStr[] = word.split("");
            String tempStr = "";
            for(int i=reverseStr.length-1; i>=0; i--){
                tempStr += reverseStr[i];
            }

            if(word.equalsIgnoreCase(tempStr))
                return true;
            else
                return false;

        }catch (Exception e){
            throw new UnsupportedOperationException("okok");
        }
    }
}
