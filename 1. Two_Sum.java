import java.util.*;

public class Two_Sum {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = { 2, 7, 11, 15 };
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indexes of I and J are " + i + " " + j);
                }
            }
        }
    }
}