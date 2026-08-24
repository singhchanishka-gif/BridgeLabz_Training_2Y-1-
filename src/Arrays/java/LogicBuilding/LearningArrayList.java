package Arrays.java.LogicBuilding;

import java.util.ArrayList;

public class LearningArrayList {
    static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0, 3);
        List.add(1, 6);
        List.add(2, 9);
        List.add(3, 12);
        System.out.println("List the Array" + List);
        int nums[] = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        System.out.println("Normal Array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
