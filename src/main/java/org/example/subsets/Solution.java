package org.example.subsets;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        subsets(nums, li, new ArrayList<>(), 0);
        return li;
    }

    public void subsets(int[] nums, List<List<Integer>> li, List<Integer> ss, int i) {
        if(i == nums.length) {
            li.add(new ArrayList<>(ss));
            return;
        }

        ss.add(nums[i]);
        subsets(nums, li, ss, i+1);
        ss.remove(ss.size()-1);
        subsets(nums, li, ss, i+1);
    }
}