package prob.leetcode.medium;

public class LongestNiceSubArray {
    public static void main(String[] args) {
        int[] nums = {1,3,8,48,10};
        System.out.println(longestNiceSubarray(nums));
    }

    public static int longestNiceSubarray(int[] nums) {
            int left = 0, usedBits = 0, max = 0;

            for (int right = 0; right < nums.length; right++) {
                while ((usedBits & nums[right]) != 0) {
                    usedBits ^= nums[left];
                    left++;
                }

                usedBits |= nums[right];
                max = Math.max(max, right - left + 1);
            }

            return max;
    }
}
