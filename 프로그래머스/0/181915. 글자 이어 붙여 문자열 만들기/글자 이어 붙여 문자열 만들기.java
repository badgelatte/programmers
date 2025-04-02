class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] letters = my_string.split("");
        String answer = "";
        
        for(int i : index_list) {
            answer += letters[i];
        }
        
        return answer;
    }
}