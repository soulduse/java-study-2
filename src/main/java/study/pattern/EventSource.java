package study.pattern;

import java.util.Observable;
import java.util.Scanner;

/**
 * Created by sould on 2016-08-12.
 */
public class EventSource extends Observable implements Runnable{

    @Override
    public void run() {
        while(true){
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}