package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "abcabcbb";  //Excepted output is 3

        int start = 0, maxLength = 0;

        Set<Character> stringSet = new HashSet<>();

        for (int end = 0; end < str.length(); end++ ) {

            while (stringSet.contains(str.charAt(end))) {

                stringSet.remove(str.charAt(start));
                start++;

            }
            stringSet.add(str.charAt(end));
            maxLength = Math.max(maxLength, end-start+1);
        }

        System.out.println(maxLength);

    }

}
