class Solution {
    public int solution(int n) {
        int sub = 1;
        int count = 0;
        int left = 1;
        int right = 1;
        
        while (left < n) {
            if (left == right) {
                sub += ++right;
            }
            
            if (sub < n) {
                sub += ++right;
            } else if (sub == n) {
                count++;
                sub -= left++;
            } else {
                sub -= left++;
            }
        }

        return ++count;
    }
}