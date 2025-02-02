class Solution {
    public int solution(int[] array, int n) {
        int answer = 101;
        
        for(int num: array) {
            if(Math.abs(n-num) == Math.abs(n-answer)) {
                if(num < answer) {
                    answer = num;
                }
            }
            
            else if(Math.abs(n-num) < Math.abs(n-answer)) {            
                answer = num;
            }
        }
        return answer;
    }
}