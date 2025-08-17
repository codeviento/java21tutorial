package next.com.codeviento.amazon.leetcode.video1;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class S04TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fregMap = new HashMap<>();

        for (int num: nums) {
            fregMap.put(num, fregMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> fregQueue = new PriorityQueue<>((a, b) -> fregMap.get(a) - fregMap.get(b));
        for (Integer key: fregMap.keySet()) {
            fregQueue.add(key);
            if (fregQueue.size() > k) {
                fregQueue.poll();
            }
        }

        int[] result = new int[k];
        for (int i =0; i < k; i++) {
            result[i] = fregQueue.poll();
        }
        return result;
    }
}
