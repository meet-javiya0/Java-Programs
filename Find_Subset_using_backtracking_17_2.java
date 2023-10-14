public class Find_Subset_using_backtracking_17_2 {
    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("NULL");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // for the yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // for the no choice
        findSubsets(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}

// T.C. = O(2^n)
// S.C. = O(n)