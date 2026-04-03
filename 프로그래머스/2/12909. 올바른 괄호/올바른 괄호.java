import java.util.Stack;

class Solution {
    boolean solution(String s) {
        String[] parenthesesArr = s.split("");
        int parentheses = 0;

        for (int i = 0; i < parenthesesArr.length; i++) {
            if (parenthesesArr[i].equals("(")) {
                parentheses += 1;
            } else {
                parentheses -= 1;
            }
            
            if (parentheses < 0) {
                return false;
            }
        }

        if (parentheses != 0) {
            return false;
        }
        
        return true;
    }
}