package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class validate_subsequence {

    /*

    My naive approach

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        List<Integer> arr = new ArrayList<>(array);
        int prevIndex = 0;
        for (Integer i : sequence){
            int currIndex = array.indexOf(i);

            if (!arr.contains(i) || (currIndex <= prevIndex && prevIndex != 0))
                return false;

            prevIndex = currIndex;
            arr = arr.subList(arr.indexOf(i) + 1, arr.size());
        }
        return true;
    }

     */

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
       int idxArr = 0;
       int idxSeq = 0;

       while (idxArr < array.size() && idxSeq < sequence.size()){
           if (array.get(idxArr).equals(sequence.get(idxSeq))){
               idxSeq++;
           }
           idxArr++;
       }

       return idxSeq == sequence.size();
    }

    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(5, 1, 22, 25, 6, -1, 8, 10);

        System.out.println(isValidSubsequence(array,sequence));
    }

}
