class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        
        char charFir = my_string.charAt(num1);
        char charSec = my_string.charAt(num2);
        
        sb.setCharAt(num1, charSec);
        sb.setCharAt(num2, charFir);
        
        return sb.toString();
    }
}