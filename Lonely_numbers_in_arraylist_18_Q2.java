import java.util.*;

public class Lonely_numbers_in_arraylist_18_Q2 {
    public static ArrayList<Integer> isLonely(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();

        // sort the arraylist
        Collections.sort(list);

        // if it is of size 1 then add it in the ans
        if (list.size() == 1) {
            ans.add(list.get(0));
        }

        // then check for index 1 to n - 2
        for (int i = 1; i < list.size() - 1; i++) {
            if ((list.get(i - 1) + 1 < list.get(i)) && (list.get(i) + 1 < list.get(i + 1))) {
                ans.add(list.get(i));
            }
        }

        // if it has more then 1 elements then check for index 0 and n - 1 elements
        if (list.size() > 1) {
            if (list.get(0) + 1 < list.get(1)) {
                ans.add(list.get(0));
            }
            if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) {
                ans.add(list.get(list.size() - 1));
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        System.out.println(isLonely(list));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(3);
        System.out.println(isLonely(list2));
    }
}

// T.C. = O(n)