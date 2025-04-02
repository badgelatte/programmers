class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] letters = my_string.split("");
        
        for(int[] query : queries) {
            String temp = "";
            for(int i = 0; i < ((query[1]-query[0])/2+1);i++) {
                temp = letters[query[0]+i];
                letters[query[0]+i] = letters[query[1]-i];
                letters[query[1]-i] = temp;
            }
        }
        
        return makeString(letters);
    }
    
    public String makeString(String[] letters) {
        String result = "";
        
        for(String letter : letters) {
            result += letter;
        }
        
        return result;
    }
}