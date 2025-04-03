import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] alphabets = my_string.toLowerCase().split("");
        
        Arrays.sort(alphabets);
        
        for(String alphabet : alphabets) {
            answer += alphabet;
        }
        
        return answer;
    }
}