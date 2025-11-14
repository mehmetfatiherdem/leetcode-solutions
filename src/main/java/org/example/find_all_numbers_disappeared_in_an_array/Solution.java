package org.example.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int in;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] < 0) {
                in = (nums[i]*(-1)) - 1;
            } else {
                in = nums[i]-1;
            }

            if(nums[in] > 0) nums[in] *=(-1);
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) list.add(i+1);
        }

        return list;
    }
}
