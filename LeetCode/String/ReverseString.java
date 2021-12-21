import java.io.IOException;
import java.util.Scanner;

/**
 * @program: LearnJava
 * @description: 反转字符串
 * @author: tang bd
 * @create: 2021-12-19 17:01
 */
public class ReverseString {
    public static void main(String[] args) throws IOException {
//        String str = "hello";
//        System.out.println("Enter a char:");
//        char i = (char) System.in.read();
//        System.out.println("Your char is :" + i);
//        System.out.println("********************");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要反转的字符串：");
        String str = sc.nextLine();
        char[] arr=str.toCharArray();
        reverseStringTest(arr);
        System.out.println(arr);
    }

    public static void reverseStringTest(char[] chars){
        int start = 0;
        int end = chars.length - 1;
        if (start == end){
            return ;
        }
        while (start < end){
            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;
            start++;
            end--;
        }
    }
}