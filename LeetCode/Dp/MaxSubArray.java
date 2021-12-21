import java.util.Scanner;

/**
 * @program: LeetCodeTest
 * @description: 数组最大子序和
 * @author: tang bd
 * @create: 2021-12-21 15:36
 */
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的数组：");
        String str = scanner.nextLine();
//        str = str.replaceAll("[^0-9a-z]",""); //字符串替换
        int[] num = stringToIntegerArray(str);
        System.out.println("该数组中最大子序和为：");
        System.out.println(MaxSubArray(num));
    }

    private static int[] stringToIntegerArray(String str){
        String[] numStr = str.split(" ");
        int[] numInt = new int[numStr.length];

        for (int i =0; i < numStr.length; i++){
            try {
                numInt[i] = Integer.parseInt(numStr[i]);
            }catch (NumberFormatException e){
                e.printStackTrace();
                return numInt;
            }
        }
        return numInt;
    }

    private static int MaxSubArray(int[] nums){
        int pre = 0;
        int maxAns = nums[0];

        for (int x : nums){
            pre = Math.max(pre+x,x);
            maxAns = Math.max(maxAns,pre);
        }
        return maxAns;
    }
}