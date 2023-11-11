import java.util.*;

public class Monotonic_arraylist_18_Q1 {
    public static boolean isMonotonic(ArrayList<Integer> list) {
        // let's consider that it is monotonic
        boolean inc = true;
        boolean dec = true;

        // check if either of the cases wrong or not
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                dec = false;
            }
            if (list.get(i) > list.get(i + 1)) {
                inc = false;
            }
        }

        // if both the cases is wrong then this returns false else true
        return inc || dec;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        System.out.println(isMonotonic(list1));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(4);
        System.out.println(isMonotonic(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);
        System.out.println(isMonotonic(list3));
    }
}

// T.C. = O(n)