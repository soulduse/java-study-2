package study.calcul;

/**
 * Created by sould on 2016-06-14.
 */
public class ColorValue {

    public static void main(String[] args) {
        int atime        = 10;
        int aspeed       = 5;
        int adistance    = 10;

        System.out.println("A 거리 : "+(aspeed*atime));
        System.out.println("A 시간 : "+(adistance/aspeed));
        System.out.println("A 속력 : "+(adistance/atime));


        System.out.println();
        int btime        = 10;
        int bspeed       = 5;
        int bdistance    = 30;

        System.out.println("B 거리 : "+(bspeed*btime));
        System.out.println("B 시간 : "+(bdistance/bspeed));
        System.out.println("B 속력 : "+(bdistance/btime));
    }
}
