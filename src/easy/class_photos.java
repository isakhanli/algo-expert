package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_photos {

    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        // Write your code here.
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);

        boolean redBack = redShirtHeights.get(0) > blueShirtHeights.get(0);

        for (int i = 0; i < redShirtHeights.size(); i++){
            if (redBack && redShirtHeights.get(i) <= blueShirtHeights.get(i))
                return false;
            else if (!redBack && blueShirtHeights.get(i) <= redShirtHeights.get(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> red = new ArrayList<>();
        red.add(5);
        red.add(8);
        red.add(1);
        red.add(3);
        red.add(4);

        ArrayList<Integer> blue = new ArrayList<>();
        blue.add(6);
        blue.add(9);
        blue.add(2);
        blue.add(4);
        blue.add(5);

        System.out.println(classPhotos(red, blue));
    }
}
