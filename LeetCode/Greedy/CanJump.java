import java.util.Scanner;

/**
 * @program: LeetCode
 * @description: 跳跃游戏
 * @author: tang bd
 * @create: 2021-12-22 16:21
 */
public class CanJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的数组：");
        String str = scanner.nextLine();
//        str = str.replaceAll("[^0-9a-z]",""); //字符串替换
        int[] num = stringToIntegerArray(str);
        if (canJump(num)){
            System.out.println("该数组可以跳转到最后！");
        }else {
            System.out.println("该数组不能跳转到最后！");
        }
    }

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
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
}