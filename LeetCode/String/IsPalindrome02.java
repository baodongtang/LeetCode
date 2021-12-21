import java.util.Scanner;

/**
 * @program: LearnJava
 * @description: 非空字符串，最多删除一个字符，判断能否成为回文
 * @author: tang bd
 * @create: 2021-12-19 17:58
 */
public class IsPalindrome02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ScannerTest, Please Enter String:");
        String str = scanner.nextLine();

        if (validPalindrome(str)){
            System.out.println("YES!");
        }else {
            System.out.println("NO!");
        }
    }

    public static boolean validPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9a-z]","");
        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();
        while(start < end){
            if(chars[start] != chars[end]){
                return isValid(s,start,end - 1) || isValid(s,start + 1,end);
            }else{
                start++;
                end--;
            }
        }
        return true;
    }

    public static boolean isValid(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}