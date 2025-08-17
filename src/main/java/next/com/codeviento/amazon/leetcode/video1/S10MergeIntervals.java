package next.com.codeviento.amazon.leetcode.video1;

import java.util.Arrays;
import java.util.LinkedList;

public class S10MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        // Step 1: Sort the intervals by their start time.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Use a LinkedList to easily access the last element.
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // If the merged list is empty or if the current interval does not overlap with the previous one.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // Otherwise, there is an overlap, so we merge the current and previous intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
