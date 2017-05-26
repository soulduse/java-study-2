package study.string;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by soul on 2017. 5. 12..
 */
public class StringContains {


    public static void main(String[] args) {
        String pattern2 = "\\d*(\\.\\d*)?";
        String pattern = "\\d*(\\.\\d{0,2})?";


        String num1 = "11.25";
        String num2 = "11.253";
        String num3 = "11.2535";
        String num4 = "11";
        String num5 = "11.";
        String num6 = "5";


        System.out.println(num1.matches(pattern));
        System.out.println(num2.matches(pattern));
        System.out.println(num3.matches(pattern));
        System.out.println(num4.matches(pattern));
        System.out.println(num5.matches(pattern));
        System.out.println(num5.matches("."));

//        System.out.println(fmt("3,333.555"));
    }


    public static String fmt(Object obj) {
        String pattern = "\\d*(\\.\\d{0,3})?";
        DecimalFormat form = new DecimalFormat("#,###.00");
        form.setRoundingMode(RoundingMode.DOWN);

        Double d = Double.parseDouble(removeCommas(obj.toString()));

        System.out.println("-----------------------------------------");
        System.out.println(form.isDecimalSeparatorAlwaysShown());
        System.out.println(form.isParseBigDecimal());
        System.out.println(form.isGroupingUsed());
        System.out.println(form.isParseIntegerOnly());
        System.out.println(obj.toString().matches(pattern));
        System.out.println("-----------------------------------------");
        return form.format(d);
    }

    public static String removeCommas(String data){
        return data.replace(",", "");
    }
}
