package com.betterme;

public class RemoveDuplicates80 {
    public int removeDuplicates80(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (j < 2 || !(nums[j] == nums[i - 1] && nums[j] == nums[i - 2])) {
                nums[i] = nums[j];
                i += 1;
            }
        }
        return i;
    }
}
