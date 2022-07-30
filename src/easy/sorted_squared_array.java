package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sorted_squared_array {

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int idx = array.length - 1;
        int firstIdx = 0;
        int lastIdx = array.length - 1;
        int[] squaredArr = new int[array.length];

        while (idx >= 0){
            if (array[firstIdx] * array[firstIdx] > array[lastIdx] * array[lastIdx]){
                squaredArr[idx] = array[firstIdx] * array[firstIdx];
                firstIdx++;
            }else {
                squaredArr[idx] = array[lastIdx] * array[lastIdx];
                lastIdx--;
            }
            idx--;
        }
        return squaredArr;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -2, 0 , 1, 5};
        System.out.println(Arrays.toString(sortedSquaredArray(arr)));
    }
}
