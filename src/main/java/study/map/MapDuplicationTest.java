package study.map;

import java.util.*;

/**
 * Created by sould on 2016-08-01.
 */
public class MapDuplicationTest {
    private Map<String, Object> map;
    private List<Map<String, Object>> mapList;
    private int time = 0;

    public static void main(String[] args) {
        MapDuplicationTest md = new MapDuplicationTest();
        md.mapInit();
    }

    private void mapInit(){
        mapList = new ArrayList<>();
        addMap("name001",10);
        addMap("name001",10);
        addMap("name002",10);
        addMap("name003",10);


        System.out.println("mapSize >> "+mapList.size());

    }


    private List<Map<String, Object>> addMap(String name, int time){
        final String NAME = "name";
        final String TIME = "time";

        int mapListSize = mapList.size();

        System.out.println("mapListSize : "+mapListSize);
        if(mapListSize > 0){
            for(int i=0; i<mapListSize; i++){
                if(mapList.get(i).get(NAME).equals(name)){
                    System.out.println("AA");
                    int sumTime = (int)mapList.get(i).get(TIME)+time;
                    mapList.get(i).put(NAME, name);
                    mapList.get(i).put(TIME, sumTime);
                }else if(!mapList.get(i).get(NAME).equals(name)){
                    System.out.println("BB");
                    mapList.get(i).put(NAME, name);
                    mapList.get(i).put(TIME, time);
                }else{
                    System.out.println("CC");
                    map = new HashMap<>();
                    map.put(NAME, name);
                    map.put(TIME, time);
                    mapList.add(map);
                }
            }
        }else{
            System.out.println("DD");
            map = new HashMap<>();
            map.put(NAME, name);
            map.put(TIME, time);
            mapList.add(map);
        }

        return mapList;
    }

}
