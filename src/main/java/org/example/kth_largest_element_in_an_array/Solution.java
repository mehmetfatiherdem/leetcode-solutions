package org.example.kth_largest_element_in_an_array;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int left, int right, int i) {
        if (left == right) {
            return nums[left];
        }

        int pivot = nums[left], l = left, h = right;

        while(l<=h) {
            while(l<=h && nums[l]<pivot) l++;
            while(l<=h && nums[h]>pivot) h--;

            if(l <= h) {
                int temp = nums[l];
                nums[l] = nums[h];
                nums[h] = temp;
                l++;
                h--;
            }
        }


        if(i <= h) {
            return quickSelect(nums, left, h, i);
        } else if(i >= l) {
            return quickSelect(nums, l, right, i);
        } else {
            return nums[i];
        }
    }
}