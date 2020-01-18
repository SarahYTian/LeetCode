package com.betterme;

public class RotateArray189 {
    // The trick is first, k can be greater than the nums length, then only rotate the mod one
    // Also, it is a template of reverse, using a while loop
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length -1);

    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start += 1;
            end -= 1;
        }
    }
}
