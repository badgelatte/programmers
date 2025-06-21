class Solution {
    public int solution(int a, int b) {
        if(a % 2 != 0 && b % 2 != 0) {
            return a * a + b * b;
        }
        else if(a % 2 == 0 && b % 2 == 0) {
            if(a > b) {
                return a - b;
            }
            return b - a;
        }
        
        return 2 * (a + b);
    }
}