class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            answer[i] = isRight(quiz[i]);
        }
        return answer;
    }
    
    public String isRight(String quiz) {
        String[] quest = quiz.split(" ");
        
        int num1 = Integer.parseInt(quest[0]);
        int num2 = Integer.parseInt(quest[2]);
        int num3 = Integer.parseInt(quest[4]);
        
        if(quest[1].equals("+")) {
            if(num1 + num2 == num3) {
                return "O";
            }
        }
        
        if(quest[1].equals("-")) {
            if(num1 - num2 == num3) {
                return "O";
            }
        }
        
        return "X";
    }
}