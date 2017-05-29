package study.calcul;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 29.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class Discount {

    private static final double A       = 10;
    private static final double B       = 20;
    private static final double PRICE   = 1000;

    public static void main(String[] args) {
        double data = PRICE*(10*0.01);
        double result = PRICE-data;


        System.out.println(result);
    }
}
