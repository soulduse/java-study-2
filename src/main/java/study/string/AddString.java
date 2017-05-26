package study.string;

/**
 * Created by soul on 2017. 3. 11..
 */
public class AddString {
    static String FLAG_IMG_URL     = "http://imgfinance.naver.net/nfinance/flag/flag_.png";

    public static void main(String[] args) {
        System.out.println(FLAG_IMG_URL.length());
        System.out.println( FLAG_IMG_URL.substring(0,FLAG_IMG_URL.length()-4));

        System.out.println(combineUrlOfFlag("USD"));
    }


    private static String combineUrlOfFlag(String flag){
        String preUrl = FLAG_IMG_URL.substring(0,FLAG_IMG_URL.length()-4);
        String sufUrl = FLAG_IMG_URL.substring(FLAG_IMG_URL.length()-4, FLAG_IMG_URL.length());

        return preUrl+flag+sufUrl;
    }
}
