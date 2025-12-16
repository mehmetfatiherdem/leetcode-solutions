package org.example.combination_sum_ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        cc(candidates, li, new ArrayList<>(), 0, 0, target);
        return li;

    }

    public void cc(int[] candidates, List<List<Integer>> li, List<Integer> cl, int start, int cursum, int target) {

        if(cursum>target) return;

        if(cursum == target) {
            li.add(new ArrayList<>(cl));
            return;
        }

        for(int i = start; i<candidates.length; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            cl.add(candidates[i]);
            cc(candidates, li, cl, i + 1, cursum + candidates[i], target);
            cl.remove(cl.size() - 1);
        }

    }
}