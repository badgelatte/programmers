import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[my_string.length()];
        int count = 0;
        
        for(char c: my_string.toCharArray()) {
            if(c < 65) {
                answer[count++] = c - 48;
            }
        }
        
        Arrays.sort(answer);
        return Arrays.copyOfRange(answer, answer.length-count, answer.length);
    }
}