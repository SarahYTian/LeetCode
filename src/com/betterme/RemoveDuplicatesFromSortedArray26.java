package com.betterme;

public class RemoveDuplicatesFromSortedArray26 {
    // Same as 27, just sorted so the comparison happens in adjacent elements
    // Note that we need to compare with new list in every loop
    public int removeDuplicates26(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[j] = nums[i];
                j += 1;
            }
        }
        return j + 1;

    }
    // This is good for follow up
    // when k

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if ( j < 2 || nums[j] > nums[i - 2]) {
                nums[i] = nums[j];
                i += 1;
            }
        }
        return i;
    }
}
