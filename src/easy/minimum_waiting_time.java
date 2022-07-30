package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimum_waiting_time {


//    public static int minimumWaitingTime(int[] queries) {
//        // Write your code here.
//        Arrays.sort(queries);
//        int minWaitingTime = 0;
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 1; i < queries.length; i++){
//            minWaitingTime += queries[i - 1];
//            list.add(minWaitingTime);
//        }
//
//        return list.stream().reduce(0, (a, b) -> a + b);
//    }

    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);
        int minWaitingTime = 0;
        int result = 0;

        for (int i = 1; i < queries.length; i++){
            minWaitingTime += queries[i - 1];
            result += minWaitingTime;
        }

        return result;
    }


//    public static int minimumWaitingTime(int[] queries) {
//        // Write your code here.
//        Arrays.sort(queries);
//        int minWaitingTime = 0;
//
//        for (int i = 0; i < queries.length; i++){
//            int duration = queries[i];
//            int queriesLeft = queries.length - i - 1;
//            minWaitingTime += duration * queriesLeft;
//        }
//
//        return minWaitingTime;
//    }



    public static void main(String[] args) {
        int[] queries = {3,2,1,2,6};
        System.out.println(minimumWaitingTime(queries));
    }
}
