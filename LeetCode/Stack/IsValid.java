import java.util.Scanner;
import java.util.Stack;

/**
 * @program: LeetCodeTest
 * @description: 有效的括号
 * @author: tang bd
 * @create: 2021-12-21 13:47
 */
public class IsValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("请输入需要判断的字符串：");

        if (isValid(str)){
            System.out.println("是有效的括号！");
        }else {
            System.out.println("不是有效的括号！");
        }
    }

    public static boolean isValid(String s){
        if (s == null){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length();i++){
            Character c = s.charAt(i);
            if (c =='(' || c== '{' || c=='['){
                stack.push(c);
            }else if (c==')'){
                if (stack.empty()){
                    return false;
                }if (stack.peek() != '('){
                    return false;
                }else {
                    stack.pop();
                }
            }
            else if(c=='}'){
                if(stack.empty()){
                    return false;
                }
                if(stack.peek()!='{'){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else if(c==']'){
                if(stack.empty()){
                    return false;
                }
                if(stack.peek()!='['){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }
}