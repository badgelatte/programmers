class Solution {
    public String[] solution(String[] names) {
        int length = calculGroup(names.length);
        String[] answer = new String[length];
        
        for(int i = 0; i * 5 < names.length; i++) {
            answer[i] = names[i * 5];
        }
        
        return answer;
    }
    
    public int calculGroup(int length) {
        if(length % 5 == 0) {
            return length / 5;
        }
        
        return length / 5 + 1;
    }
}