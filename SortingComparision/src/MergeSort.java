public class MergeSort {
    public static long Sort(int[] arr){
        long start= System.nanoTime();
        MergeSort.sort(0 , arr.length -1 , arr);
        long end= System.nanoTime();
        return end - start;
    }
    private static void sort(int l , int r , int[] arr){
        if(l<  r){
            int m = (l +r) / 2;
            sort(l , m , arr);
            sort(m+1 , r , arr);
            merge(l , m  , r , arr);
        }
    }
    private static void merge(int l , int m , int r , int[] arr){
        int n1 = m - l + 1;
        int n2 = r -m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0 ; i < n1 ; i++){
            L[i] = arr[l+i];
        }
        for(int i = 0 ; i < n2 ; i++){
            R[i] = arr[m+1+i];
        }
        int jl = 0 , jr = 0 , k = l;
        while (jl< n1 && jr < n2){
            if(L[jl] < R[jr]){
                arr[k] = L[jl];
                jl++;
                k++;
            }
            else{
                arr[k] = R[jr];
                jr++;
                k++;
            }
        }
        while (jl < n1){
            arr[k] = L[jl];
            jl++;
            k++;
        }
        while (jr < n2){
            arr[k] = R[jr];
            jr++;
            k++;
        }
    }

}
