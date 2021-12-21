import java.util.Arrays;

/**
 * @program: LearnJava
 * @description:
 * @author: tang bd
 * @create: 2021-12-19 16:14
 */
public class ArrayTest {
    public static void main(String[] args) {
        int b[][] = new int[][] {{1},{2,3},{4,5,6}};
        for (int i = 0; i < b.length;i++){
            for (int j = 0; j<b[i].length; j++){
                System.out.println(b[i][j]);
            }
            System.out.println();
        }
        System.out.println("******************");


        Integer arr[] = new Integer[]{1,5,3,7,8};
        Arrays.sort(arr);
        Arrays.asList(arr).forEach(a -> System.out.println(a));
        System.out.println("************");
        Arrays.asList(arr).forEach(System.out::println);
    }
}