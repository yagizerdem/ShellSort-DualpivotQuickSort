public class DualPivotQuickSort {

    private static void swap(int i , int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static long Sort(int[] arr){
        long start= System.currentTimeMillis();
        sort(arr , 0 , arr.length-1);
        long end= System.currentTimeMillis();
        return end - start;
    }
    private static void sort(int[] arr , int low , int high){
        if(low < high){
            int[] piv = partition(arr , low ,high);
            sort(arr ,low , piv[0]-1);
            sort(arr, piv[0] +1 , piv[1]-1);
            sort(arr, piv[1] +1 , high);
        }
    }

    static int[] partition(int[] arr , int low , int high) {
        if (arr[low] > arr[high]) {
            swap(low, high, arr);
        }
        int j = low + 1 ,g = high - 1;
        int k = low + 1;
        int p = arr[low], q = arr[high];

        while (k <= g) {
            if (arr[k] < p) {
                swap(k, j, arr);
                j++;
            } else if (arr[k] >= q) {
                while (arr[g] > q && k < g) {
                    g--;
                }
                swap(k, g, arr);
                g--;
                if (arr[k] < p) {
                    swap(k, j, arr);
                    j++;
                }
            }
            k++;
        }
        j--;
        g++;

        swap(low , j , arr);
        swap(high , g ,arr);

        return  new int[]{j,g};
    }
}
