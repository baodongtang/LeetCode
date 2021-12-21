import java.util.Scanner;

/**
 * @program: LearnJava
 * @description: 验证给定字符串是否是回文
 * @author: tang bd
 * @create: 2021-12-19 17:45
 */
public class IsPalindrome01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ScannerTest, Please Enter String:");
        String str = scanner.nextLine();
        if (isPalindrome(str)){
            System.out.println("YES!");
        }else {
            System.out.println("NO!");
        }
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9a-z]","");
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();
        while(start < end){
            if(chars[start] != chars[end]){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}