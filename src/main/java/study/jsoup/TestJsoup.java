package study.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 20.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class TestJsoup {
    private Document doc;

    private static final String URL = "http://info.finance.naver.com/marketindex/";


    public static void main(String[] args) {
        TestJsoup tj = new TestJsoup();
//        System.out.println(tj.getParserDoc());
//        System.out.println(tj.gewExchangeDate());
        tj.getExchangeDates();
    }

    private Document getParserDoc(){
        try{
            doc = Jsoup.connect(URL).get();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return doc;
    }


    public String gewExchangeDate(){
        Document doc = getParserDoc();
        Elements titleLinks = doc.select(".graph_info");
        Element element = titleLinks.get(0);
        return element.text();
    }

    public String getExchangeDates(){
        Document doc = getParserDoc();
        Elements link = doc.select(".graph_info");
        Element element = link.get(0);
        System.out.println(element);
        String time = element.select(".time").text();
        String source = element.select(".source").text();
        String count = element.select(".count").text();
        String num = element.select(".num").text();

        System.out.println(time + " / "+source+" / "+count+" / "+num );

        System.out.println(time);
        return element.text();
    }


    public Date toDate(String dateString) {
        Date date = null;
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            date = formatter.parse(dateString);

        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        return date;
    }
}
