import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int count = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer[count++] = i;
            }
        }
        
        return Arrays.copyOfRange(answer, 0, count);
    }
}