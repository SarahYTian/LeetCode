package com.betterme;

public class RemoveDuplicatesFromSortedArray26 {
    // Same as 27, just sorted so the comparison happens in adjacent elements
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j += 1;
            }
        }
        return j;

    }
}
