import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] result = a.toCharArray();
        for(char c : result){
            System.out.println(c);
        }
    }
}