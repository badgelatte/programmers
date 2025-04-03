class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n < 0 && n > 1000000) {
            return 0;
        }
        
        while(n > 0) {
            int num = n % 10;
            answer += num;
            n = n / 10;
        }
        return answer;
    }
}