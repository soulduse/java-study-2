package study.map;

import java.util.*;

/**
 * Created by sould on 2016-08-05.
 */
public class SetTest {

    public static void main(String[] args) {

        List<Map<String,Object>> mapList = new ArrayList<>();
        Map<String, Object> map= new HashMap<>();
        map.put("name", "aaa");
        map.put("total", 10);
        mapList.add(map);
        map= new HashMap<>();
        map.put("name", "bbb");
        map.put("total", 10);
        mapList.add(map);
        map= new HashMap<>();
        map.put("name", "aaa");
        map.put("total", 10);
        mapList.add(map);
        map= new HashMap<>();
        map.put("name", "aaa");
        map.put("total", 30);
        mapList.add(map);
        map= new HashMap<>();
        map.put("name", "aaa");
        map.put("total", 10);
        mapList.add(map);


        Set<Map<String, Object>> set = new HashSet<>();
        for(int i=0; i<mapList.size(); i++){
            set.add(mapList.get(i));
        }

        ArrayList list = new ArrayList();
        list.addAll(set);
        for(int i=0; i<list.size();i ++){
            Map<String, Object> mapData = (Map<String, Object>) list.get(i);
            String name = (String)mapData.get("name");
            int total = (int)mapData.get("total");
            System.out.println("name : "+name + " / total : "+total);
        }


//        Iterator iter = set.iterator();
//        while(iter.hasNext()){
//            Map<String, Object> mapData = (Map<String, Object>)iter.next();
//            String name = (String)mapData.get("name");
//            int total = (int)mapData.get("total");
//
//
//            System.out.println("name : "+name + " / total : "+total);
//        }
//        System.out.println(set);

    }
}
