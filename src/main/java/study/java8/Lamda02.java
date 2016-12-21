package study.java8;

/**
 * Created by soul on 2016. 12. 21..
 */
public class Lamda02 {
    public static void main(String[] args) {
        Lamda02 lamda02 = new Lamda02();

        // with type declaration
        MathOperation additionn = (int a, int b) -> a+b;

        // with out type declaration
        MathOperation subraction = (a, b) -> a - b;

        // with return statement along with curly braces
        MathOperation multiplecation = (int a, int b) -> {return a*b;};

        // without return statement and without curly braces
        MathOperation division = (int a, int b) -> a/b;

        System.out.println("10 + 5 = "+lamda02.operate(10, 5, additionn));
        System.out.println("10 - 5 = "+lamda02.operate(10, 5, subraction));
        System.out.println("10 * 5 = "+lamda02.operate(10, 5, multiplecation));
        System.out.println("10 / 5 = "+lamda02.operate(10, 5, division));

        // with parenthesis
        GreetingService greetingService1 = message ->
                System.out.println("Hello "+message);

        // with parenthesis
        GreetingService greetingService2 = message ->
                System.out.println("Hello "+message);

        greetingService1.sayMessage("Dave");
        greetingService1.sayMessage("Jinju");
    }

    interface MathOperation{
        int operate(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operate(a,b);
    }
}
