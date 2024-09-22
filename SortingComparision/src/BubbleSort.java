import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {
    static long Sort(int[] arr){
        long start = System.nanoTime();
        boolean isSorted = false;
        for(int i = 0 ; i < arr.length -1 ; i++){
            isSorted = true;
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
        long end = System.nanoTime();
        return  end - start;
    }
}
