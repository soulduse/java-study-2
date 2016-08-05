package study.map;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by sould on 2016-07-15.
 */
public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "Kim");
        map.put("002", "Lee");
        map.put("003", "Choi");

        System.out.println(map.size());
        SimpleDateFormat sdf = new SimpleDateFormat();

        Set<String> keys = map.keySet();
        Iterator<String> iter= keys.iterator();
        while(iter.hasNext()){
            String key   = iter.next();
            String value = map.get(key);
            System.out.println("key : "+key+" / value : "+value);
        }
    }
}
