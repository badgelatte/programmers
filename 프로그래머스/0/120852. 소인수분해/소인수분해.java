import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        int count = 0;
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                answer[count++] = i;
            }
        }
        
        return Arrays.copyOf(answer, count);
    }
    
    
}