public class SelectionSort {
    static long Sort(int[] arr){
        long start = System.nanoTime();
        int n =  arr.length;
        for(int i = 0; i < n-1 ;i++){
            int minIndex = i;
            for(int j = i +1 ; j < n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        long end= System.nanoTime();
        return end - start;
    }
}
