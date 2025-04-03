class Solution {
    public int solution(int n) {
        int squared = 0;
        
        while (squared * squared <= n) {
            if(squared * squared++ == n) {
                return 1;
            }
        }
        
        return 2;
    }
}