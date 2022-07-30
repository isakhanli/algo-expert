package easy;

public class binary_search {

    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        int start = 0;
        int end = array.length - 1;

        return binarySearchHelper(start, end, array, target);
    }

    public static int binarySearchHelper(int start, int end, int[] array, int target){
        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (array[mid] == target)
            return mid;

        if (array[mid] > target)
            return binarySearchHelper(start, mid - 1, array, target);
        else
            return binarySearchHelper(mid + 1, end, array, target);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,7,8,9,10,11,23,34,45,55,65,68};
        System.out.println(binarySearch(arr, 68));
    }
}
