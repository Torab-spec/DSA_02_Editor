package sorting.algo;

public class SelectionSort implements SortingAlgo {
    @Override
    public void sort(int[] nums) {

    }

    public static void main(String[] args) {
        int[] nums = {9, 5, 24, 25, 20, 28, 7, 8};
        SortingAlgo sortingAlgo = new SelectionSort();
        sortingAlgo.sort(nums);
        System.out.println("Sorted Array");
        printArray(nums);
    }
    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
