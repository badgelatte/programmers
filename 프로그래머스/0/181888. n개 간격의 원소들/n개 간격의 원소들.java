class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = isLen(num_list.length, n); 
        int[] answer = new int[length];
        int now = 0;
        
        for(int i = 0; i < num_list.length; i+= n) {
            answer[now++] = num_list[i];
        }
        
        return answer;
    }
    
    public int isLen(int length, int n) {
        if(length % n == 0) {
            return length / n;
        }
        
        return length / n + 1;
    }
}