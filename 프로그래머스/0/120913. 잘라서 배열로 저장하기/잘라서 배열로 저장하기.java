class Solution {
    public String[] solution(String my_str, int n) {
        int answerLen = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        
        String[] answer = new String[answerLen];
        
        for(int i = 0; i < answer.length -1; i++) {
            answer[i] = my_str.substring(i*n, i*n+n);
        }
        answer[answer.length-1] = my_str.substring((answer.length-1) * n);
        
        return answer;
    }
}