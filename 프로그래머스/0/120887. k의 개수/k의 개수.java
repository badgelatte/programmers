class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for(int a = i; a <= j; a++) {
            count = isSame(a, k, count);
        }
        return count;
    }
    
    public int isSame(int quotient, int num, int count) {
        while(quotient > 0) {
            if(quotient % 10 == num) {
                count++;
            }
            quotient /= 10;
        }
        
        return count;
    }
}