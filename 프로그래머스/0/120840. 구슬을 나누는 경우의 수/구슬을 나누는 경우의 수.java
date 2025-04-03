class Solution {
    public int solution(int balls, int share) {
        double numerator = 1;
        for(int i = balls; i > balls-share; i--) {
            numerator *= i;
        }
        double denominator = 1;
        while(share > 0) {
            denominator *= share--;
        }
        double result = numerator / denominator;
        return (int) result;
    }
}