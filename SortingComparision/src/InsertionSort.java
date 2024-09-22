public class InsertionSort {
    public static long Sort(int[] arr){
        long start= System.nanoTime();

        int n = arr.length;
        for(int i = 1 ; i< n ; i++){
            int key = arr[i] , j = i-1;
            while (j >= 0 && arr[j] > key){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
            arr[j+1] = key;
        }

        long end= System.nanoTime();
        return end - start;
    }
}
