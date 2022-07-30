package easy;

import java.util.Arrays;

public class tandem_bicycle {

    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        if (fastest)
            return handleFastest(redShirtSpeeds, blueShirtSpeeds);

        return handleSlowest(redShirtSpeeds, blueShirtSpeeds);
    }

    public static int handleFastest(int[] redShirtSpeeds, int[] blueShirtSpeeds){
        int maxSpeedSum = 0;
        int counter = 0;
        int lastIdx = redShirtSpeeds.length - 1;
        int firstIdx = 0;
        int size = redShirtSpeeds.length;

        while (counter < size){
            int maxSpeed = Math.max(redShirtSpeeds[firstIdx], blueShirtSpeeds[lastIdx]);
            maxSpeedSum += maxSpeed;

            firstIdx++;
            lastIdx--;
            counter++;
        }

        return maxSpeedSum;
    }

    public static int handleSlowest(int[] redShirtSpeeds, int[] blueShirtSpeeds){
        int maxSpeedSum = 0;

        for (int i = 0; i < redShirtSpeeds.length; i++){
            maxSpeedSum += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
        }

        return maxSpeedSum;
    }

    public static void main(String[] args) {
        int[] red = {5,5,3,9,2};
        int[] blue = {3,6,7,2,1};

        System.out.println(tandemBicycle(red, blue, true));
    }
}
