package org.example.next_greater_element_i;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums2.length; i++) {
            hm.put(nums2[i], i);
        }

        int k = 0;
        for (int i : nums1) {
            int n = -1;
            for (int l = hm.get(i); l < nums2.length; l++) {
                if (nums2[l] > i) {
                    n = nums2[l];
                    break;
                }

            }
            res[k++] = n;
        }


        return res;
    }
}
