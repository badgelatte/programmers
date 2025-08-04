class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(compareNums(i + j, k)){
                    answer += board[i][j];
                }
            }
        }
        
        return answer;
    }
    
    public boolean compareNums(int num1, int num2) {
        return num1 <= num2;
    }
}