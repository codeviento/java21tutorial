package next.com.codeviento.amazon.leetcode.video1;

import java.util.HashMap;
import java.util.Map;

public class S06MinSubString {

    public String minimumSubString(String s, String t) {

        if (s == null || t == null || s.length() < t.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, start = 0, minLen = Integer.MAX_VALUE, required = t.length();

        while (right < s.length()) {
            char c = s.charAt(right);
            if (need.containsKey(c)) {
                if (need.get(c) > 0) required--;
                need.put(c, need.get(c) - 1);
            }
            right++;

            while (required == 0) {
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }
                char ch = s.charAt(left);
                if (need.containsKey(ch)) {
                    need.put(ch, need.get(ch) + 1);
                    if (need.get(ch) > 0) required++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
