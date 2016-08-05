package study.string;

/**
 * Created by sould on 2016-08-02.
 */
public class StringSplitTest {

    public static void main(String[] args) {
        String data = "http://dev32.rayis.co.kr:9093/uploads/json/soul03";
        String[] result = data.split("/uploads/json/");
        result[0] = result[0].substring(7,result[0].length());
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
