package study.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sould on 2016-05-09.
 */
public class ClassicJavaResort {


    // (A) company 속성값이 특정한 값과 일치하는 Guest 객체만 필터링
    private List<Guest> filter(List<Guest> guests, String company) {
        List<Guest> filtered = new ArrayList<>();
        for (Guest guest : guests) {
            if (company.equals(guest.getCompany())) {
                filtered.add(guest);
            }
        }
        return filtered;
    }

    // (B) grade 속성값을 기준으로 Guest 객체를 오름차순으로 정렬
    private void sort(List<Guest> guests) {
        Collections.sort(guests, new Comparator<Guest>() {
            public int compare(Guest o1, Guest o2) {
                return Integer.compare(o1.getGrade(), o2.getGrade());
            }
        });
    }

    // (C) name 속성만 추출해 List<String>으로 변환
    private List<String> mapNames(List<Guest> guests) {
        List<String> names = new ArrayList<>();
        for (Guest guest : guests) {
            names.add(guest.getName());
        }
        return names;
    }

}
