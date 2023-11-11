import java.util.*;

public class Pair_sum_1_two_pointer_approach_18_5 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        // initialize pointers
        int lp = 0;
        int rp = list.size() - 1;

        // check for the target
        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list, target));
    }
}

// T.C. = O(n)