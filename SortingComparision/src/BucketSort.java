import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class BucketSort {
    public static  long Sort(int[] arr){
        long start= System.nanoTime();
        int bucketCount = (int)Math.sqrt(arr.length);
        int max = BucketSort.findMax(arr);
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i = 0 ; i < bucketCount; i++){
            buckets.add(new ArrayList<>());
        }
        // place in buckets
        for(int cur : arr){
            int hash = BucketSort.hash(cur,max, bucketCount);
            buckets.get(hash).add(cur);
        }
        // sort buckets
        for(List<Integer> bucket : buckets){
            // insertion sort
            int n = bucket.size();
            for(int i = 1 ; i <n ;i++){
                int key = bucket.get(i) , j = i-1;
                while (j >= 0 && bucket.get(j) > key){
                    // swap
                    int temp = bucket.get(j);
                    bucket.set(j , bucket.get(j+1));
                    bucket.set(j+1 , temp);
                    j--;
                }
                bucket.set(j +1, key);
            }
        }
        // merge buckets
        List<Integer> merge = new ArrayList<>();
        for(List<Integer>bucket : buckets){
            merge.addAll(bucket);
        }
        int[] sorted = merge.stream().mapToInt(i->i).toArray();
        arr = sorted;

        long end= System.nanoTime();
        return end - start;
    }
    private static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int cur : arr){
            if(cur > max) max = cur;
        }
        return  max;
    }
    private static  int hash(int cur , int max , int size){
        return  (int)((long)(cur / max) * (long)(size -1));
    }
}
