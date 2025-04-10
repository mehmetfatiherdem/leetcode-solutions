package org.example.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> s = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            if(s.contains(nums[i])) return true;

            s.add(nums[i]);
        }
        return false;
    }
}
