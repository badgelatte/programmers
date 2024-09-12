class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = 0;
        int[] scoreByBig = new int[score.length];
        
        while(k > 0) {
            for(int i = 0; i<score.length; i++){
                if(score[i] == k) {
                    scoreByBig[count++] = score[i];
                }
            }
            k--;
        }
        for(int i = 0; i < score.length/m; i++) {
            answer += scoreByBig[i*m+m-1] * m;
        }
        return answer;
    }
}