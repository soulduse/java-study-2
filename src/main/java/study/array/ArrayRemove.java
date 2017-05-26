package study.array;

/**
 * Created by soul on 2017. 3. 10..
 */
public class ArrayRemove {


    public static void main(String[] args) {
        Object [] arr = {1,0,2,3,4,5,6};
        Object [] copyArr;

        copyArr = java.util.Arrays.copyOf(arr, arr.length);
        System.out.println(arr.length);

        if(copyArr.length >= 7){
            for(int i=1; i<copyArr.length-1; i++){
                copyArr[i] = copyArr[i+1];
            }

            arr = new Object[copyArr.length-1];
            for(int i=0; i<copyArr.length-1; i++){
                arr[i] = copyArr[i];
            }

            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]);
            }
        }


    }
}
