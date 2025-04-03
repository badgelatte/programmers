class Solution {
    public int solution(int n) {
        int add = 0;
        
        for(int i = 0; i <= n; i+=2) {
            add += i;
        }
        return add;
    }
}