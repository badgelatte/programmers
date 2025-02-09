class Solution {
    public int solution(int[] numbers) {
        int maxNum = numbers[0] * numbers[1];
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(maxNum < numbers[i] * numbers[j]) {
                    maxNum = numbers[i] * numbers[j];
                }
            }
        }
        
        return maxNum;
    }
}