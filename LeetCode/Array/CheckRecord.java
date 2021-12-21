import java.util.Scanner;

/**
 * @program: LearnJava
 * @description: 统计字符串
 * @author: tang bd
 * @create: 2021-12-19 18:29
 */
public class CheckRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ScannerTest, Please Enter String:");
        String str = scanner.nextLine();
        if (checkRecord(str)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }

    public static boolean checkRecord(String s) {
        //连续迟到2次以上
        if (s.indexOf("LLL") != -1) {
            return false;
        }
        int Asum = 0;
        //统计词频率
        for (Character c : s.toCharArray()) {
            if (c == 'A') {
                Asum++;
            }
            //超过1个A
            if (Asum > 1) {
                return false;
            }
        }
        return true;
    }
}