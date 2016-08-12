package study.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sould on 2016-08-12.
 */
public class ObserverPattern {

    public static void main(String[] args) {
        System.out.println("Enter Text :");
        EventSource eventSource = new EventSource();
        eventSource.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Received response : "+arg);
            }
        });

        new Thread(eventSource);
    }
}
