package sorting.algo;

import utilitySort.SortUtility;

public class SelectionSort implements SortingAlgo {


    @Override
    public void sort(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            SortUtility.swap(nums, i, min);
        }

    }

    public static void main(String[] args) {
        int[] nums = {9, 5, 24,20};
        SortingAlgo sortingAlgo = new SelectionSort();
        sortingAlgo.sort(nums);
        System.out.println("Sorted Array");
        SortUtility.printArray(nums);
    }

}
