import java.util.Scanner;

/**
 * @program: LearnJava
 * @description: 指定位置反转
 * @author: tang bd
 * @create: 2021-12-19 17:36
 */
public class ReverseString02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ScannerTest, Please Enter String:");
        String str = scanner.nextLine();
        System.out.println("ScannerTest, Please Enter k:");
        Integer k = scanner.nextInt();
        System.out.println(reverseStr2(str,k));
    }

    public static String reverseStr2(String s, int k) {
        int n = s.length();
        //反转轮次
        int time = 1;
        char[] chars = s.toCharArray();
        for(int i = 0;i < n;){
            //记录每一轮次的结束字符的索引
            int j = Math.min(n,time * 2 * k);
            //记录剩余字符个数
            int rest = j - i;
            if(rest >= k){
                //剩余字符多余k个，则反转前k个
                reverse(chars,i,i + k - 1);
            }else{
                //否则将剩余的所有全部反转
                reverse(chars,i,j - 1);
            }
            i = j;
            time++;
        }
        return String.valueOf(chars);
    }

    public static void reverse(char[] s, int i, int j) {
        //双指针法
        int start = i;
        int end = j;
        if(start == end){
            return;
        }
        while(start < end){
            char c = s[start];
            s[start] = s[end];
            s[end] = c;
            start++;
            end--;
        }
    }
}