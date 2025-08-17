package next.com.codeviento.amazon.leetcode.video1;

public class S09ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;
        while (left < right) {
            // Calculate the width of the container
            int width = right - left;
            // The height is limited by the shorter of the two lines
            int h = Math.min(height[left], height[right]);
            // Calculate the area for the current container
            int currentArea = width * h;
            // Update the maximum area found so far
            maxArea = Math.max(maxArea, currentArea);
            // Move the pointer of the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
