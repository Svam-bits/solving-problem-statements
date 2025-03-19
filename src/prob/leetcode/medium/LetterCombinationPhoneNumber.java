package prob.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Character, List<String>> keypad = new HashMap<>();
        keypad.put('2', List.of("a", "b", "c"));
        keypad.put('3', List.of("d", "e", "f"));
        keypad.put('4', List.of("g", "h", "i"));
        keypad.put('5', List.of("j", "k", "l"));
        keypad.put('6', List.of("m", "n", "o"));
        keypad.put('7', List.of("p", "q", "r", "s"));
        keypad.put('8', List.of("t", "u", "v"));
        keypad.put('9', List.of("w", "x", "y", "z"));

        List<String> res = new ArrayList<>();

        if(digits.isEmpty()) return res;
        else if (digits.length() == 1) {
            char ch = digits.charAt(0);
            res.addAll(keypad.get(ch));
        } else if (digits.length() == 2) {
            char ch1 = digits.charAt(0);
            char ch2 = digits.charAt(1);
            List<String> list1 = keypad.get(ch1);
            List<String> list2 = keypad.get(ch2);

            for (String char1 : list1) {
                for (String char2 : list2) {
                    res.add(char1 + char2);
                }
            }
        } else if (digits.length() == 3) {
            char ch1 = digits.charAt(0);
            char ch2 = digits.charAt(1);
            char ch3 = digits.charAt(2);
            List<String> list1 = keypad.get(ch1);
            List<String> list2 = keypad.get(ch2);
            List<String> list3 = keypad.get(ch3);

            for (String char1 : list1) {
                for (String char2 : list2) {
                    for (String char3 : list3) {
                        res.add(char1 + char2 + char3);
                    }
                }
            }
        } else if (digits.length() == 4) {
            char ch1 = digits.charAt(0);
            char ch2 = digits.charAt(1);
            char ch3 = digits.charAt(2);
            char ch4 = digits.charAt(3);
            List<String> list1 = keypad.get(ch1);
            List<String> list2 = keypad.get(ch2);
            List<String> list3 = keypad.get(ch3);
            List<String> list4 = keypad.get(ch4);

            for (String char1 : list1) {
                for (String char2 : list2) {
                    for (String char3 : list3) {
                        for (String char4 : list4) {
                            res.add(char1 + char2 + char3 + char4);
                        }
                    }
                }
            }
        }


        return res;
    }
}
