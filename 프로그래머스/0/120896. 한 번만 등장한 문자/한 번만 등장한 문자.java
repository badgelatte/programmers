import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] letters = s.split("");
        Arrays.sort(letters);
        s = String.join("",letters);
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                answer.append(s.charAt(i));
            }
        }
        
        return answer.toString();
    }
}