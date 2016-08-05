package study.string;

/**
 * Created by sould on 2016-06-30.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("aa");
        sb.append("bb");
        sb.append("cc");
        sb.append("dd");

        System.out.println(sb.toString());
        System.out.println("sb.capacity() : "+sb.capacity());
        System.out.println("sb.length() : "+sb.length());
        sb.delete(0, sb.length());
        System.out.println(sb);
    }
}
