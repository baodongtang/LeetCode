import java.util.Scanner;

/**
 * @program: LeetCodeTest
 * @description: 字符串最长回文子串
 * @author: tang bd
 * @create: 2021-12-21 11:27
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = scanner.nextLine();

        System.out.println("该字符串最长子串为" + longestPalindrome01(str));
    }

    //暴力解法
    public static String longestPalindrome01(String s){
        int len = s.length();
        if (len<2){
            return s;
        }

        int maxlen = 1;
        int begin = 0;
        char[] charArray = s.toCharArray();

        for (int i =0; i< len -1; i++){
            for (int j = i+1; j<len; j++){
                if (j-i+1 >maxlen && validPalindrome(charArray, i,j)){
                    maxlen = j - i + 1;
                    begin = i;
                }
            }
        }
        return  s.substring(begin,begin + maxlen);
    }

    private static boolean validPalindrome(char[] charArray, int left, int right){
        while (left < right){
            if (charArray[left] != charArray[right]){
                return false;
            }
            left++;
            right++;
        }
        return true;
    }

//动态规划
    public String longestPalindrome02(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        // dp[i][j] 表示 s[i..j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为 1 的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();
        // 递推开始
        // 先枚举子串长度
        for (int L = 2; L <= len; L++) {
            // 枚举左边界，左边界的上限设置可以宽松一些
            for (int i = 0; i < len; i++) {
                // 由 L 和 i 可以确定右边界，即 j - i + 1 = L 得
                int j = L + i - 1;
                // 如果右边界越界，就可以退出当前循环
                if (j >= len) {
                    break;
                }

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}