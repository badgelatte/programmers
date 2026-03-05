class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 0;
        int length = 0;
        
        // wid + len
        int plusNums = 0;
        // wid * len
        int mulNums = 0;
        
        plusNums = (brown + 4) / 2;
        mulNums = yellow - 4 + 2 * plusNums;
        
        int rootM = Math.abs(mulNums);
        int num = 1;
        
        for (int i = 1; i < rootM; i++) {
            if (mulNums % i == 0 && i + (mulNums/i) == plusNums) {
                num = i;
            }
        }
        
        answer[0] = Math.max(num, mulNums/num);
        answer[1] = Math.min(num, mulNums/num);
        
        return answer;
    }
}