package easy;

import java.util.ArrayList;
import java.util.List;

public class product_sum {
//    public static int productSum(List<Object> array) {
//        // Write your code here.
//
//        int sum = 0;
//        List<List<Integer>> list = new ArrayList<>();
//
//        for (Object obj : array){
//            List<Integer> l = new ArrayList<>();
//            list.add(l);
//            recursiveDepthSum(obj, l, 1);
//            int s = l.stream().reduce(Integer::sum).get();
//            sum += s;
//
//        }
//        System.out.println(list);
//        return sum;
//    }
//
//    public static void recursiveDepthSum(Object obj, List<Integer> list, int depth){
//        if (obj instanceof List){
//            for (Object o : (List)obj){
//                recursiveDepthSum(o,list, depth + 1);
//            }
//        }
//        else {
//            int dp = depth == 1 ? 1 : depth - 1;
//            list.add(dp * depth * (int) obj);
//        }
//
//    }


    public static int productSum(List<Object> array) {
        // Write your code here.
        return recursiveDepthSum(array, 1);
    }

    public static int recursiveDepthSum(List<Object> array, int depth){
        int sum = 0;

        for(Object obj : array){
            if (obj instanceof List){
                sum += recursiveDepthSum((List)obj, depth + 1);
            }else
                sum += (int) obj;
        }

        return sum * depth;
    }

    public static void main(String[] args) {

        List<Object> array = List.of(5,2, List.of(7, -1), 3, List.of(6, List.of(-13, 8), 4));
        System.out.println(productSum(array));

    }
}
