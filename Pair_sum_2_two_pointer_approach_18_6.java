import java.util.*;

public class Pair_sum_2_two_pointer_approach_18_6 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        // check for the largest element in arraylist for breaking point
        int breakingPoint = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakingPoint = i;
                break;
            }
        }

        // take pointers
        int lp = breakingPoint + 1;
        int rp = breakingPoint;
        int n = list.size();

        // check for target
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int target = 16;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list, target));
    }
}

// T.C. = O(n)