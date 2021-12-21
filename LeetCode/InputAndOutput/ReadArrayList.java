import java.util.Scanner;

/**
 * @program: LeetCode
 * @description: 从控制台读入一个数组
 * @author: tang bd
 * @create: 2021-12-21 18:23
 */
public class ReadArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的数组：");
        String str = scanner.nextLine();
//        str = str.replaceAll("[^0-9a-z]",""); //字符串替换
        int[] num = stringToIntegerArray(str);
        System.out.println("该字符串转换的数组为：");
        System.out.println(num.toString());
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