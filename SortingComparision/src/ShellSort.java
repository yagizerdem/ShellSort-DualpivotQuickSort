public class ShellSort {

    public static long Sort(int[] arr){
        long start= System.currentTimeMillis();
        int n = arr.length;
        for(int gap = n / 2 ; gap > 0 ; gap /= 2){
            for(int i = gap ; i < n ; i++){
                int key = arr[i] , j = i - gap;
                while (j>= 0 && arr[j] > key){
                    arr[j + gap] = arr[j];
                    j-=gap;
                }
                arr[j+gap] = key;
            }
        }
        long end= System.currentTimeMillis();
        return end - start;
    }
}
