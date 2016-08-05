package study.calcul;

/**
 * Created by sould on 2016-08-04.
 */
public class IntegerRandomTest {
    public static void main(String[] args) {
        String randomTestIp[] = {"172.16.135.27","219.255.217.140:9161"};
        System.out.println(randomTestIp[(int)(Math.random()*2)]);
    }
}
