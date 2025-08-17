package next.com.codeviento.amazon.leetcode.video1;

import java.util.HashMap;
import java.util.Map;

public class S03SubArraysK {

    public int subArraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);

        for (int num : nums) {
            sum += num;
            count += prefixSums.getOrDefault(sum - k, 0);
            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
