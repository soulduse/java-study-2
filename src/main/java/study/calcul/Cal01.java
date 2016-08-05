package study.calcul;

/**
 * Created by sould on 2016-06-10.
 */
public class Cal01 {

    public static void main(String[] args) {
        int clientWidth = 1920;
        int makeWidth   = 2212;
        int speed       = getSpeed(4);
        int duration    = 0;
        float duraionDetail = 0f;

        System.out.println("clientWidth : "+clientWidth+" / makeWidth : "+makeWidth+" / speed : "+speed);
        duration = (int)((makeWidth + clientWidth) / speed);
        duraionDetail = (float) ((makeWidth + clientWidth) / speed);
        System.out.println("duration : "+duration +" /  duraionDetail :"+duraionDetail);
    }

    private static int getSpeed(int temp){
        switch(temp)
        {
            case 1: temp =  1 * 50; 			break;
            case 2: temp =  (int) (1.5 * 50); 	break;
            case 3: temp =  2 * 50; 			break;
            case 4: temp =  (int) (2.5 * 50); 	break;
            case 5: temp =  3 * 50;  			break;
            default: temp = 3 * 50;				break;
        }

        return temp;
    }
}
