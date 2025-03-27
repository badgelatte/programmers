class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int min = Math.min(M,N);
        int max = Math.max(M,N);
        
        return (min - 1) + (max - 1) * min;
    }
}