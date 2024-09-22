import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
//        test1();


        int[] arr = new Random().ints(12, 0, 101).toArray();

        test2();
    }
    public  static  void test1(){
        int[] arr = new Random().ints(12, 0, 101).toArray();

        long bubleSortElapsed = BubbleSort.Sort(arr.clone());
        System.out.println(String.format("Elapesed time in buble sort : %s ns" , bubleSortElapsed));

        long SelectionSortElapsed = SelectionSort.Sort(arr.clone());
        System.out.println(String.format("Elapesed time in selection sort : %s ns" , SelectionSortElapsed));

        long InsertionSortElapsedTime = InsertionSort.Sort(arr.clone());
        System.out.println(String.format("Elapesed time in insertion sort : %s ns" , InsertionSortElapsedTime));

        long BucketSortElapsedTime = BucketSort.Sort(arr.clone());
        System.out.println(String.format("Elapesed time in bucket sort : %s ns" , BucketSortElapsedTime));

        long MergeSortElapsedTime = MergeSort.Sort(arr.clone());
        System.out.println(String.format("Elapesed time in merge sort : %s ns" , MergeSortElapsedTime));

        long QuickSortElapsedTime = QuickSort.Sort(arr.clone());
        System.out.println(String.format("Elapesed time in quick sort : %s ns" , QuickSortElapsedTime));

    }

    public static void test2(){
        int[] arr = new Random().ints(1000000, 0, Integer.MAX_VALUE).toArray();
        long ShellSortElapsedTime = ShellSort.Sort(arr.clone());
        System.out.println(String.format("Elapesed time in shell sort : %s ms" , ShellSortElapsedTime));


        long DualPivotSortElapsedTime = DualPivotQuickSort.Sort(arr.clone());
        System.out.println(String.format("Elapesed time in dual pivot quick sort : %s ms" , DualPivotSortElapsedTime));
    }

}