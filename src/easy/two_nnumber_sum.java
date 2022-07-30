package easy;


import java.util.Arrays;

public class two_nnumber_sum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == targetSum){
                    int[] res = new int[2];
                    res[0] = array[i];
                    res[1] = array[j];
                    return res;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int array[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        System.out.println(Arrays.toString(twoNumberSum(array, targetSum)));
    }
}
