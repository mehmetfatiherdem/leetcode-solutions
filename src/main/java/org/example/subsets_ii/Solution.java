package org.example.subsets_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        f(li, new ArrayList<>(), nums, 0);
        return li;

    }

    public void f(List<List<Integer>> li, List<Integer> cl, int[] nums, int start) {

        li.add(new ArrayList<>(cl));

        if (start == nums.length)
            return;

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            cl.add(nums[i]);
            f(li, cl, nums, i + 1);
            cl.remove(cl.size() - 1);
        }

    }
}
