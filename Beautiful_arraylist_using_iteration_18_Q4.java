import java.util.*;

public class Beautiful_arraylist_using_iteration_18_Q4 {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();

            // Add all even elements
            for (Integer e : ans) {
                if (2 * e <= n) {
                    temp.add(e * 2);
                }
            }

            // Add all odd elements
            for (Integer e : ans) {
                if (2 * e - 1 <= n) {
                    temp.add(e * 2 - 1);
                }
            }

            ans = temp;
        }

        return ans;
    }

    public static void main(String args[]) {
        int n1 = 3;
        System.out.println(beautifulArray(n1));
        int n2 = 4;
        System.out.println(beautifulArray(n2));
        int n3 = 5;
        System.out.println(beautifulArray(n3));
    }
}

// T.C. = O(n)
// S.C. = O(n)