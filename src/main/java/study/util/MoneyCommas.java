package study.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by soul on 2017. 3. 10..
 */
public class MoneyCommas {


    final static String data1 = "1,100.50";
    final static String data2 = "1,125.10";
    final static String data3 = "1,150.35";
    final static String data4 = "22,312,200.35";

    public static void main(String[] args) {
        MoneyCommas mc = new MoneyCommas();
        System.out.println(mc.changeStringToNumber(data4));
        System.out.println(mc.addCommas(mc.changeStringToNumber(data4)));
    }

    private Object changeStringToNumber(String data){
        Object result;

        String removeCommasData = removeCommas(data);

        if(removeCommasData.length() >= 11){
            result = new BigDecimal(removeCommasData);
        }else{
            result = Double.parseDouble(removeCommasData);
        }
        return result;
    }

    private String addCommas(Object obj){
        String result = String.format("%,.2f",obj);
        return result;
    }

    private String removeCommas(String data){
        return data.replace(",", "");
    }

    /*
    private String addCommas(double data){
        NumberFormat numformat = new DecimalFormat("###,###.###");
        String result = numformat.format(data);
        return result;
    }
    */

    /*
    private BigDecimal changeDataBigDecimal(String data){
        BigDecimal result = new BigDecimal(data.replace(",", ""));
        return result;
    }

    private double changeDataDouble(String data){
        double result = Double.parseDouble(data.replace(",", ""));
        return result;
    }


    private String addCommas(double data){
        NumberFormat numformat = new DecimalFormat("###,###.###");
        String result = numformat.format(data);
        return result;
    }

    private String addCommas2(double data){
        String result = String.format("%,.2f",data);
        return result;
    }

    private String addCommas(BigDecimal data){
        NumberFormat numformat = new DecimalFormat("###,###.###");
        String result = numformat.format(data);
        return result;
    }

    private String addCommas2(BigDecimal data){
        String result = String.format("%,.2f",data);
        return result;
    }
    */
}
