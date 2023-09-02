public class Tower_of_Hanoi_14_Q5 {
    public static void towerHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfered disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer n - 1 disk from src to helper using dest as a helper
        towerHanoi(n - 1, src, dest, helper);
        // transfer nth disk from src to dest
        System.out.println("Transfered disk " + n + " from " + src + " to " + dest);
        // transfer n - 1 disk from helper to dest using src as a helper
        towerHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        towerHanoi(4, "A", "B", "C");
    }
}

// Question: TOWER OF HANOI (Important!) You have 3 towers and N disks of
// different sizes which can slide onto any tower. The puzzle starts with disks
// sorted in ascending order of size from top to bottom (i.e., each disk sits on
// top of an even larger one). You have the following constraints:
// (1) Only one disk can be moved at a time.
// (2) A disk is slid off the top of one tower onto another tower.
// (3) A disk cannot be placed on top of a smaller disk. Write a program to move
// the disks from the first tower to the last using Stacks.
