package study.string;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by sould on 2016-07-01.
 */
public class StringIncoding {
    public static void main(String[] args) throws Exception {
        String msg = "\"tp_fontcontents\" : \"\\uc548\\ub155\\ud558\\uc138\\uc694_Hello_\\u3053\\u3093\\u306b\\u3061\\u306f\\u3002_\\u60a8\\u597d\\uff01_Xin ch\\u00e0o._\\u0417\\u0434\\u0440\\u0430\\u0432\\u0441\\u0442\\u0432\\u0443\\u0439\\u0442\\u0435_.\\u0645\\u0631\\u062d\\u0628\\u064b\\u0627_\\u0421\\u0430\\u0439\\u043d \\u0431\\u0430\\u0439\\u043d\\u0430 \\u0443\\u0443\",\"tp_fontfamily\" : \"\\ub3cb\\uc6c0\\uccb4\"";
        System.out.println(msg);


        String sampleStr = "한글";
        String result = URLDecoder.decode(msg, "ISO8859-1");
        String result2 = URLEncoder.encode(msg, "UTF-8");
        String result3 = new String(msg.getBytes("EUC-KR"), "EUC-KR");
        String result4 = new String(msg.getBytes("UTF-8"), "UTF-8");

        System.out.println("1 : "+result);
        System.out.println("2 : "+result2);
        System.out.println("3 : "+result3);
        System.out.println("4 : "+result4+"\n");

        String aa = URLDecoder.decode(sampleStr, "UTF-8");
        String bb = URLEncoder.encode(sampleStr, "UTF-8");
        String cc = new String(sampleStr.getBytes("EUC-KR"), "EUC-KR");
        String dd = new String(sampleStr.getBytes("UTF-8"), "UTF-8");

        char[] a = "uc548".toCharArray();
        System.out.println(a[0]);

        System.out.println("1 : "+aa);
        System.out.println("2 : "+bb);
        System.out.println("3 : "+cc);
        System.out.println("4 : "+dd);


        System.out.println(decode(msg));

    }

    public static String decode(String unicode)throws Exception {
        StringBuffer str = new StringBuffer();

        System.out.println(unicode.indexOf("\\uddd"));

        char ch = 0;
        for( int i= unicode.indexOf("\\u"); i > -1; i = unicode.indexOf("\\u") ){
            ch = (char)Integer.parseInt( unicode.substring( i + 2, i + 6 ) ,16);
            str.append( unicode.substring(0, i) );
            str.append( String.valueOf(ch) );
            unicode = unicode.substring(i + 6);
        }
        str.append( unicode );

        return str.toString();
    }

    public static String encode(String unicode)throws Exception {
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < unicode.length(); i++) {
            if(((int) unicode.charAt(i) == 32)) {
                str.append(" ");
                continue;
            }
            str.append("\\u");
            str.append(Integer.toHexString((int) unicode.charAt(i)));

        }

        return str.toString();

    }

}
