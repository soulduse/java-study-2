package study.map;

import java.util.*;

/**
 * Created by sould on 2016-07-26.
 */
public class MapSet {
    public static void main(String[] args) {
        final String NAME   = "name";
        final String AGE    = "age";
        final String PAGE   = "page";

        List<Map<String,String>> mapAddList = new ArrayList<>();
        Map<String,String> map = new HashMap<String,String>();
        map.put(NAME,"김현우");
        map.put(AGE,"28세");
        map.put(PAGE,"http://aa");
        mapAddList.add(map);
        map = new HashMap<String,String>();
        map.put(NAME,"홍길동");
        map.put(AGE,"150세");
        map.put(PAGE,"http://aa");
        mapAddList.add(map);
        map = new HashMap<String,String>();
        map.put(NAME,"김현우");
        map.put(AGE,"28세");
        map.put(PAGE,"http://aa");
        mapAddList.add(map);
        map = new HashMap<String,String>();
        map.put(NAME,"미란다크다커");
        map.put(AGE,"27세");
        map.put(PAGE,"http://aa");
        mapAddList.add(map);
        map = new HashMap<String,String>();
        map.put(NAME,"김현우");
        map.put(AGE,"27세");
        map.put(PAGE,"http://aa");
        mapAddList.add(map);
        map = new HashMap<String,String>();
        map.put(NAME,"김현우");
        map.put(AGE,"27세");
        map.put(PAGE,"http://aad");
        mapAddList.add(map);
        map = new HashMap<String,String>();
        map.put(NAME,"김현우");
        map.put(AGE,"27세");
        map.put(PAGE,"http://aac");
        mapAddList.add(map);
        map = new HashMap<String,String>();
        map.put(NAME,"김현우");
        map.put(AGE,"27세");
        map.put(PAGE,"http://aab");
        mapAddList.add(map);

        for(int i=0; i<mapAddList.size(); i++){
            String name = mapAddList.get(i).get(NAME);
            String age = mapAddList.get(i).get(AGE);
            System.out.println("name : "+name+" / age : "+age);
        }
        System.out.println("============================================================");
        List<Map<String,String>> resultList = new ArrayList<>(new HashSet<>(mapAddList));
        for(int i=0; i<resultList.size(); i++){
            String name = resultList.get(i).get(NAME);
            String age = resultList.get(i).get(AGE);
            String page = resultList.get(i).get(PAGE);
            System.out.println("name : "+name+" / age : "+age+" / page : "+page);
        }
    }
}
