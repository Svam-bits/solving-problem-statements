package prob.gfg.medium;

import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(findMajority(arr));
    }

    public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        HashMap<Integer, Integer> voteMap = new HashMap<>();
        List<Integer> results = new ArrayList<>();

        int n = nums.length;
        for(int i = 0; i < n; i++) {
            voteMap.put(nums[i], voteMap.getOrDefault(nums[i], 0)+1);
        }

        int check = n/3;
        voteMap.forEach((key, value) ->{
            if(value > check) {
                results.add(key);
            }
        });
        return results;
    }
}
