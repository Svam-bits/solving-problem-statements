package prob.gfg.medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr ={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        System.out.println("Array before rotation " + Arrays.toString(arr));
        rotateArr(arr, d);
        System.out.println("Array after rotation " + Arrays.toString(arr));
    }

    static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        d %= n;

        int[] temp = new int[n];

        for (int i = 0; i < n - d; i++)
            temp[i] = arr[d + i];

        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    /*
    time limit exceeds for below code
     */
//    static void rotateArr(int[] arr, int d) {
//        // add your code here
//        int n = arr.length;
//        for(int i = 0; i < d; i++) {
//            int temp = arr[0];
//            for(int j = 0; j < n; j++) {
//                if(j == n-1) {
//                    arr[j] = temp;
//                } else {
//                    arr[j] = arr[j+1];
//                }
//            }
//        }
//    }
}
