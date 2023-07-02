public class Trapping_rain_water_8_Q4 {
    public static int trappedWater(int height[]) {
        // for left max height
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // for right max height
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // calculating trapped water
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            trappedWater = trappedWater + Math.min(rightMax[i], leftMax[i]) - height[i];
        }

        if (trappedWater > 0) {
            return trappedWater;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        int height1[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Trapped water: " + trappedWater(height1));
        int height2[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println("Trapped water: " + trappedWater(height2));
    }
}