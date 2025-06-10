package prob.leetcode.easy;

import java.util.*;

public class MaxDiffFrequencyEvenOdd {
	public static int maxDifference(String s) {
		Map<Character,Integer> map =new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Integer> values =  new ArrayList(map.values());
        int maxEven = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;
        
        for(int num : values) {
        	if(num % 2 == 0 ) {
        		if(num < maxEven)
        			maxEven = num;
        	} else {
        		if (num > maxOdd)
        			maxOdd = num;
        	}
        }
        
        return maxOdd - maxEven;
    }
	
	public static void main(String[] args) {
		String s = "mmsmsym";
		System.out.println(maxDifference(s));
	}
}
