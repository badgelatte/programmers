class Solution {
    public int solution(int n, int k) {
        int service = 0;
        if(n >= 10) {
            service  = n / 10;
        }
        return 12000 * n + 2000 * (k-service);
    }
}