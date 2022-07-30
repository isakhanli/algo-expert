package easy;

import java.util.Arrays;

public class non_constructible_change {

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.

        if (coins.length == 0)
            return 1;

        Arrays.sort(coins);
        int minChange = 0;

        for (int coin : coins) {
            if (coin > minChange + 1)
                break;

            minChange += coin;
        }

        return minChange + 1;
    }


    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};

        System.out.println(nonConstructibleChange(coins));
    }
}
