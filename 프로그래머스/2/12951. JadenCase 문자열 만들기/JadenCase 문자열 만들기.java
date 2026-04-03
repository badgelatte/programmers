class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        char letter;
        Boolean isFirst = true;
        
        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            
            if (letter == ' ') {
                isFirst = true;
            } else if (isFirst) {
                sb.setCharAt(i, Character.toUpperCase(letter));
                isFirst = false;
            }
        }        
        
        return sb.toString();
    }
}