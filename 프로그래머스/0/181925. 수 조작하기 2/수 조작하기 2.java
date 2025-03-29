class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++) {
            answer += convertStr(numLog[i] - numLog[i-1]);
        }
        
        return answer;
    }
    
    public String convertStr(int num) {
        switch(num) {
            case (1) : return "w";
            case (-1) : return "s";
            case (10) : return "d";
            default : return "a";
        }
    }
}