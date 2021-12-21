import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LearnJava
 * @description:
 * @author: tang bd
 * @create: 2021-12-18 18:31
 */
public class ToNumbersSum {
    public static void main(String[] args){
        int a = 9;

        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        int[] result = twoSum(nums,a);
        System.out.println(result.toString());
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length -1; i >= 0; i--) {
            int firstNum = target - nums[i];
            if (map.containsKey(firstNum)) {
                return new int[]{i, map.get(firstNum)};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException();
    }
}