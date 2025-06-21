class Solution {
    public String solution(String myString) {
        char[] letters = myString.toCharArray();
        String answer = "";
        
        for(int i = 0; i < letters.length; i++) {
            if(letters[i] < 108) {
                answer += "l";
            }
            else {
                answer += letters[i];
            }
        }
        
        return answer;
    }
}