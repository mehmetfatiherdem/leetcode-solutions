package org.example.combination_sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        combinationSum(candidates, li, new ArrayList<>(), 0, 0, target);
        return li;
    }

    public void combinationSum(int[] candidates, List<List<Integer>> li, List<Integer> cl, int i, int currSum, int target) {
        if(i >= candidates.length || currSum > target) return;
        if(currSum == target) {
            li.add(new ArrayList<>(cl));
            return;
        }
        cl.add(candidates[i]);
        combinationSum(candidates, li, cl, i, currSum + candidates[i], target);
        cl.remove(cl.size()-1);
        combinationSum(candidates, li, cl, i+1, currSum, target);
    }
}
