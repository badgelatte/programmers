import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            }else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            result += chars[i];
        }
        System.out.println(result);
    }
}