package com.betterme;

public class Main {

    public static void main(String[] args) {
        RemoveElement27 re27 = new RemoveElement27();
        int[] nums27 = new int[] {3, 2, 2, 3};
        int result27 = re27.removeElement1(nums27, 3);
        System.out.println("Problem 27 RemoveElements: " + result27);

        RemoveDuplicatesFromSortedArray26 rd26 = new RemoveDuplicatesFromSortedArray26();
        int[] nums26 = new int[] {2, 2, 2, 3};
        int result26 = rd26.removeDuplicates(nums26);
        System.out.println("Problem 26 Remove Duplicates from Sorted Array: " + result26);

    }

}
