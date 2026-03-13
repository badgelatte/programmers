import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        while (!(str = sc.nextLine()).equals("0")) {
            String[] strs = str.split(" ");
            String result = prefixToPostfix(strs);
            System.out.println(result);
        }

    }

    public static String prefixToPostfix (String[] strs) {
        Stack<String> stack = new Stack<>();
        String str = "";

        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].equals("+")) {
                str += stack.pop() + " ";
                str += stack.pop() + " +";
                stack.push(str);
            } else if (strs[i].equals("-")) {
                str += stack.pop() + " ";
                str += stack.pop() + " -";
                stack.push(str);
            } else {
                stack.push(strs[i]);
            }
            
            str = "";
        }

        return stack.pop();
    }
}
