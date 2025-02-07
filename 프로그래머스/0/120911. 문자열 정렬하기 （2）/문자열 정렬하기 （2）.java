import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        char[] alphabets = my_string.toCharArray();
        
        Arrays.sort(alphabets);
        
        for(char c : alphabets) {
            answer += c;
        }
        
        return answer;
    }
}