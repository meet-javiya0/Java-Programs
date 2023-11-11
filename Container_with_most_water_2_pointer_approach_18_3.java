import java.util.*;

public class Container_with_most_water_2_pointer_approach_18_3 {
    public static int maxStoredWater(ArrayList<Integer> height) {
        int lp = 0;
        int rp = height.size() - 1;
        int maxWater = 0;
        while (lp < rp) {
            // calculate water level
            int currWater = (Math.min(height.get(lp), height.get(rp)) * (rp - lp));
            maxWater = Math.max(maxWater, currWater);

            // update pointers
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maxStoredWater(list));
    }
}

// T.C. = O(n)