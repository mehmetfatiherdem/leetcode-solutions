package org.example.daily_temperatures;

import java.util.Stack;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int tlen = temperatures.length;
        int[] days = new int[tlen];
        days[tlen-1] = 0;
        int i = 0;
        for(; i<tlen; i++) {
            while(!stack.empty() && temperatures[stack.peek()]<temperatures[i]) {
                int ind = stack.pop();
                days[ind] = i-ind;
            }
            stack.push(i);
        }

        return days;
    }
}
