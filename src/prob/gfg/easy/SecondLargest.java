package prob.gfg.easy;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        int res = -1;
        if(n < 2) {
            return res;
        }

        Arrays.sort(arr);
        int max = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] != max) {
                return arr[i];
            }
        }

        return res;
    }
}
