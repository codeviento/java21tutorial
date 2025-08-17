package next.com.codeviento.amazon.leetcode.video1;

import java.util.HashSet;
import java.util.Set;

public class S07LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (window.contains(currentChar)) {
                window.remove(s.charAt(left++));
                // left++;
            }

            window.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
