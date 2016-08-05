package study.array;

/**
 * Created by sould on 2016-07-22.
 */
public class IntegerArray {

    public static void main(String[] args) {
        int[][] a = new int[2][2];

        a[0][0] = 5;
        a[0][1] = 1;
        a[1][0] = 2;
        a[1][1] = 3;

        for(int i=0; i<a.length * a[0].length; i++){
            int row = i/a[0].length;
            int colum = i%a[0].length;
            System.out.println(a[row][colum]);
        }
    }
}
