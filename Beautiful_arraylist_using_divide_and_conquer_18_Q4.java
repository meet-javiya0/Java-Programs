import java.util.*;

public class Beautiful_arraylist_using_divide_and_conquer_18_Q4 {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        divideAndConquer(1, 1, ans, n);
        return ans;
    }

    public static void divideAndConquer(int start, int increment, ArrayList<Integer> ans, int n) {
        if (start + increment > n) {
            ans.add(start);
            return;
        }
        divideAndConquer(start + increment, increment * 2, ans, n);
        divideAndConquer(start, increment * 2, ans, n);
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
// S.C. = O(log(n))