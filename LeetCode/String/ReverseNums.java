import java.util.Scanner;

/**
 * @program: LeetCodeTest
 * @description: 反转整数
 * @author: tang bd
 * @create: 2021-12-21 11:09
 */
public class ReverseNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串整数：");
        int num = scanner.nextInt();
        System.out.println(reverse(num));
    }

    public static int reverse(int x){
        int res = 0;
        while (x!=0){
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x/=10;
        }
        return  res;
    }
}