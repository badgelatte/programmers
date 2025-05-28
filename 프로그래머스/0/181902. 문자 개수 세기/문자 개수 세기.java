class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] charArr = my_string.toCharArray();
        
        for(int i = 0; i < charArr.length; i++) {
            if(charArr[i] < 97) {
                answer[charArr[i] - 65]++;
            }
            else {
                // -98 + 26 = 71
                answer[charArr[i] - 71]++;
            }
            
        }
        
        return answer;
    }
}