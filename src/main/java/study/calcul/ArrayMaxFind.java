package study.calcul;

/**
 * Created by sould on 2016-07-12.
 */
public class ArrayMaxFind {

    public static void main(String[] args) {
        int [] arr = {1,10,35,40,5,100,5,300,600,10,20};
        int max     = 0;

        for(int i=0; i<arr.length; i++){
            if(max<=arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
