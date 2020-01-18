package com.betterme;

public class RemoveElement27 {
    // Method 1 Two pointers, one traverses the array, the other updates the array if the element can be left.
    public int removeElement1(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j += 1;
            }
        }
        return j;
    }

    // Method 2 Is better when removed elements are only few, traverses the array, if find one to remove, swap with the last and tune the length.
    // Note not to hurry in moving forward pointer, as the last element can also be removed.
    public int removeElement2(int[] nums, int val) {
        int i = 0;
        int len = nums.length;
        while (i < len) {
            if (nums[i] == val) {
                nums[i] = nums[len - 1];
                len -= 1;
            } else {
                i += 1;
            }
        }
        return len;
    }

}
