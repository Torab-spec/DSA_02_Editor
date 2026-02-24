package sorting.algo;

public class SelectionSort implements SortingAlgo {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

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
            swap(nums, i, min);
        }

    }

    public static void main(String[] args) {
        int[] nums = {9, 5, 24,20};
        SortingAlgo sortingAlgo = new SelectionSort();
        sortingAlgo.sort(nums);
        System.out.println("Sorted Array");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
