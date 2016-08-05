package study.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sould on 2016-05-09.
 */
public class ListSearch {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        ArrayList<Object> list = new ArrayList<>();
        map.put("id", "soul01");
        list.add(map);
        map.put("id", "soul02");
        list.add(map);
        map.put("id", "soul03");
        list.add(map);
        map.put("id", "soul04");
        list.add(map);
        map.put("id", "soul05");
        list.add(map);


        boolean result = list.contains("id");
        System.out.println(result);
    }



}
