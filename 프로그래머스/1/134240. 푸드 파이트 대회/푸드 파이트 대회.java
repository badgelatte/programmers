class Solution {
    public String solution(int[] food) {
        String result = "";
        String reverseResult = "";
        
        for (int i = 0; i < food.length; i++) {
            food[i] /= 2;
            
            while (food[i] > 0) {
                result += i;
                reverseResult = i + reverseResult;
                food[i]--;
            }
        }
        
        return result + "0" + reverseResult;
    }
}