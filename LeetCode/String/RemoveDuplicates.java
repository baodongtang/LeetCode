import java.util.Scanner;

/**
 * @program: LearnJava
 * @description: 从排序数组中删除重复项
 * @author: tang bd
 * @create: 2021-12-19 18:37
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ScannerTest, Please Enter Srting:");
        String str = scanner.nextLine();
        int arr[] = stringToIntegerArray(str);
        int a = removeDuplicates(arr);
        System.out.println(a);

    }

    private static int[] stringToIntegerArray(String str) {
        if (str.isEmpty()) {
        }
        String[] numStr = str.split(" ");
        int[] numsInt = new int[numStr.length];

        for (int i = 0; i < numStr.length; i++) {
            try {
                numsInt[i] = Integer.parseInt(numStr[i]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return numsInt;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // index从索引0开始
        int index = 0;
        // i从索引1开始遍历
        for (int i = 1; i < nums.length; i++) {
            // 不相同则进行扩展，index永远指向符合条件数组的最后一个索引
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }
}