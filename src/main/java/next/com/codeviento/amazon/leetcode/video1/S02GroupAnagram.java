package next.com.codeviento.amazon.leetcode.video1;

import java.util.*;

public class S02GroupAnagram {
    public List<List<String>> groupAnagram(List<String> words) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (String word: words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            anagramsMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
