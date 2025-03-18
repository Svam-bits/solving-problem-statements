package prob.gfg.medium;

import java.util.Arrays;

public class KthSmallest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println(kthSmallest(arr, k));
    }

    public static int kthSmallest(int[] arr, int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }

//    Below code is using java 8
//    public static int kthSmallest(int[] arr, int k) {
//        return Arrays.stream(arr).sorted().limit(k).max().getAsInt();
//    }
}
