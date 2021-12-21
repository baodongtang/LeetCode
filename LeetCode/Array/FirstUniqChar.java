import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: LearnJava
 * @description: 字符串中第一个唯一字符
 * @author: tang bd
 * @create: 2021-12-19 18:07
 */
public class FirstUniqChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ScannerTest, Please Enter String:");
        String str = scanner.nextLine();

        System.out.println(firstUniqChar(str));
    }

    /**
     * 字符串中第一个唯一字符
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        //统计词频率
        for(Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        //按序遍历找出第一个唯一的字符
        for(Character c : s.toCharArray()){
            if(map.containsKey(c) && map.get(c) == 1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}