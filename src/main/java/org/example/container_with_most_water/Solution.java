package org.example.container_with_most_water;

public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int maxArea = 0;
        int w, h;
        while(j > i) {

            w = j - i;
            if(height[i] > height[j]) h = height[j--];
            else h = height[i++];

            int area = w * h;
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}