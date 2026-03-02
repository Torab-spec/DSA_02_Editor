package sorting.algo;

import utilitySort.SortUtility;

public class BubbleSort implements SortingAlgo {

    @Override
    public void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <n-1; i++){
            for (int j = 0; j< n-i-1; j++){
                SortUtility.swap(nums, i, j);
            }
        }


    }

    public static void main(String[] args) {
        int [] arr = {3,5,8,4,2};
        SortingAlgo sortingAlgo = new BubbleSort();
        sortingAlgo.sort(arr);
        System.out.println("Sorted Array");
        SortUtility.printArray(arr);    }
}
