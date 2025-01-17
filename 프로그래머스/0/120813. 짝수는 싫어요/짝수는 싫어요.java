class Solution {
    public int[] solution(int n) {
        int length = n % 2 == 0 ? n/2 : n/2+1;
        int[] answer = new int[length];
        int count = 0;
        
        while(++count <= length) {
            answer[count-1] = 2*count-1;
        }
        return answer;
    }
}