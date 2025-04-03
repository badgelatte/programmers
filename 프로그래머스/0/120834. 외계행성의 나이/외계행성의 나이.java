class Solution {
    public String solution(int age) {
        String answer = "";
        
        while(age > 0) {
            answer = changeToChar(age%10) + answer;
            age = age/10;
        }
        return answer;
    }
    
    public String changeToChar(int age) {
        return String.valueOf((char)(age+97));
    }
}