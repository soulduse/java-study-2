package socar;

import java.util.Random;

/**
 * Created by developerkhy@gmail.com on 2017. 6. 15.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class MineCraft {

    private static final int WIDTH = 10;
    private static final int HIGHT = 10;
    private static final String arr[][] = new String[HIGHT][WIDTH];



    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                arr[i][j] = " o ";
            }
        }


        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print(arr[i][j]);
                if(j==9){
                    System.out.println();
                }
            }
        }
    }


    private String makeMine(){
        Random random = new Random();
        random.ints(10);
        return " * ";
    }

    private String makeNumber(){
        return "";
    }




}
