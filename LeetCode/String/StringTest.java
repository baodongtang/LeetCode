/**
 * @program: LearnJava
 * @description:
 * @author: tang bd
 * @create: 2021-12-19 16:00
 */
public class StringTest {
    public static void main(String[] args){
        String str = "如何让自己变得更加优秀，有钱！";
        System.out.println(str);

        int lenth = str.length();
        System.out.println(lenth);

        char ch = str.charAt(8);
        System.out.println(ch);

        char chars[] = new char[47];
        str.getChars(0,12,chars,0);
        System.out.println(chars);
        System.out.println("******************************");

        String str1 = "hello";
        String str2 = "hi";
        String str3 = "HELLO";
        String str4 = "HI";

        if (str1.compareTo(str3) > 0){
            System.out.println(str1 + ">" + str2);
        }
    }
}