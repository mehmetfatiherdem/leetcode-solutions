package org.example.largest_rectangle_in_histogram;

import java.util.List;
import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxh = 0;
        Stack<List<Integer>> st = new Stack<>();

        for(int i = 0; i<heights.length; i++) {

            int start = i;

            while(!st.isEmpty() && heights[i] < st.peek().get(1)) {
                List<Integer> tp = st.pop();
                int w = i-tp.get(0);
                maxh = Math.max(maxh, w*tp.get(1));
                start = tp.get(0);
            }

            st.push(List.of(start, heights[i]));
        }

        while(!st.isEmpty()) {
            List<Integer> top = st.pop();
            int hi = top.get(1);
            int in = top.get(0);
            maxh = Math.max(maxh, hi*(heights.length-in));
        }


        return maxh;
    }
}
