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
    }

    interface GreetingService{
        void sayMessage(String messsage);
    }
}
