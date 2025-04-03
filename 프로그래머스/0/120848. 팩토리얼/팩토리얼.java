class Solution {
    public int solution(int n) {
        int factorial = 1;
        int num = 0;
        
        while(n >= factorial) {
            factorial *= ++num;
        }
        
        return --num;
    }
}