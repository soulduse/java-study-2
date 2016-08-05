package study.calcul;

/**
 * Created by sould on 2016-08-02.
 */
public class Calcu {

    private static final float VERSION1 = 3.0f;
    private static final float VERSION2 = 3.1f;


    public static void main(String[] args) {
        versionCheck(VERSION2);

    }

    private static void versionCheck(float version){
        if(version == 3.0f){
            System.out.println("3.0 버전 !! ");
        }else if(version == 3.1f){
            System.out.println("3.1 버전 !! ");
        }
    }
}
