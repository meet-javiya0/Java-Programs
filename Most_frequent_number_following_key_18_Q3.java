import java.util.*;

public class Most_frequent_number_following_key_18_Q3 {
    public static int mostFrequntFollowingNumber(ArrayList<Integer> nums, int key) {
        int[] freq = new int[1000];

        // first count frequency
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                freq[nums.get(i + 1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        // then check which frequency is maximum
        for (int i = 0; i < 1000; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int key = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        System.out.println(mostFrequntFollowingNumber(list, key));

        int key2 = 2;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        System.out.println(mostFrequntFollowingNumber(list2, key2));
    }
}

// T.C. = O(n)