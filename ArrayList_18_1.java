import java.util.*;

public class ArrayList_18_1 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // add elements to the list
        list.add(1); // time required: O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);

        // add element at a specific index
        list.add(2, 6); // time required: O(n)
        System.out.println(list);

        // get element from the list
        int element = list.get(2); // time required: O(1)
        System.out.println(element);

        // remove element from the list
        list.remove(2); // time required: O(n)
        System.out.println(list);

        // set element in the list
        list.set(2, 10); // time required: O(1)
        System.out.println(list);

        // contains element in the list
        System.out.println(list.contains(10)); // time required: O(n)
        System.out.println(list.contains(12));

        // size of the list
        System.out.println(list.size()); // time required: O(1)

        // print the arraylist
        for (int i = 0; i < list.size(); ++i) { // time required: O(n)
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // method 2 to print the arraylist
        System.out.println(list);

        // print reverse of the arraylist
        for (int i = list.size() - 1; i >= 0; i--) { // time required: O(n)
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // method 2 to reverse the arraylist
        Collections.reverse(list);
        System.out.println(list);

        // finding max element in the list
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); ++i) { // time required: O(n)
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);

        // method 2 to find max element in the list
        System.out.println(Collections.max(list));

        // finding min element in the list
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); ++i) { // time required: O(n)
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println(min);

        // method 2 to find min element in the list
        System.out.println(Collections.min(list)); // time required: O(n)

        // swap two elements in the list
        int temp = list.get(0);
        list.set(0, list.get(2));
        list.set(2, temp);
        System.out.println(list);

        // method 2 for swap two elements in the list
        Collections.swap(list, 0, 2); // time required: O(1)
        System.out.println(list);

        // sort the list in ascending order
        Collections.sort(list); // time required: O(nlogn)
        System.out.println(list);

        // sort the list in descending order
        Collections.sort(list, Collections.reverseOrder()); // time required: O(nlogn)
        System.out.println(list);

        // shuffle the list
        Collections.shuffle(list); // time required: O(n)
        System.out.println(list);

        // clear the list
        list.clear(); // time required: O(1)
        System.out.println(list);

        // check if the list is empty
        System.out.println(list.isEmpty()); // time required: O(1)
    }
}