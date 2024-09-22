public class QuickSort {
    public static long Sort(int[] arr){
        long start= System.nanoTime();
        QuickSort.sort(0 ,arr.length-1 , arr);

        long end= System.nanoTime();
        return end - start;
    }
    private static  void sort(int low , int high , int[] arr){
        if(low < high){
            int pivot = QuickSort.partition(low , high , arr);
            sort(low , pivot-1 , arr);
            sort(pivot+1 , high ,arr);
        }
    }
    private static int partition(int low , int hight , int[] arr){
        int pivot = arr[hight];
        int i = low -1;
        for(int j = low ; j < hight; j++){
            if(arr[j] < pivot){
                i++;
                swap(i , j , arr);
            }
        }
        swap(i+1 , hight , arr);
        return  i+1;
    }

    private static void swap(int i , int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
