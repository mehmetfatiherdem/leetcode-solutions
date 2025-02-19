package org.example.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int[] pair = new int[2];
        for(int i = 0; i<nums.length; i++){
            if(m.get(target - nums[i]) == null){
                m.put(nums[i], i);
                continue;
            }

            pair[0] = m.get(target - nums[i]);
            pair[1] = i;
        }

        return pair;
    }
}
