class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 0;
        int length = 0;
        
        // wid + len
        int plusLens = 0;
        // wid * len
        int mulLens = 0;
        
        plusLens = (brown + 4) / 2;
        mulLens = yellow - 4 + 2 * plusLens;
        
        int num1 = 1;
        int num2 = plusLens - num1;
        
        while(num2 > 0 && num1 * num2 != mulLens) {
            num1++;
            num2--;
        }
        
        answer[0] = num2;
        answer[1] = num1;
        
        return answer;
    }
}