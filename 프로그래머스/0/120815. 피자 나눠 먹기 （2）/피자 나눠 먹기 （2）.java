class Solution {
    public int solution(int n) {
        int gcd = 1;
        int num = n > 6 ? n : 6;
        
        for(int i = 2; i <= n; i++) {
            if((n%i ==0) && (6%i == 0)) {
                gcd = i;
            }
        }
        
        return n/gcd;
    }
}