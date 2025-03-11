class Solution {
    public int solution(int n) {
        int count = 1;
        for(int i = 2; i <= n; i++) {
            count++;
            while(isNothingWith3(count)) {
                count++;
            }
        }
        
        return count;
    }
    
    public boolean isNothingWith3(int n) {
        if(n > 10 && (n % 10 == 3 || n / 10 == 3)) {
            return true;
        }
        
        if(n > 100) {
            if((n / 10) % 10 == 3) {
                return true;
            }
        }
        
        return n % 3 == 0;
    }
}