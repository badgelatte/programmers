class Solution {
    public int solution(String A, String B) {
        if(isSame(A,B)) {
            return 0;
        }
        
        String[] ALetters = A.split("");
        int count = 0;
        
        while(count++ < A.length()) {
            if(B.equals(moveRight(ALetters))) {
                return count;
            }
        }
        
        return -1;
    }
    
    public boolean isSame(String A, String B) {
        return A.equals(B);
    }
    
    public String moveRight (String[] letters){
        String temp = "";
        
        for(int i = letters.length - 1; i > 0; i--) {
            temp = letters[i];
            letters[i] = letters[i-1];
            letters[i-1] = temp;
        }
        
        return arrToStr(letters);
        
    }
    
    public String arrToStr(String[] letters) {
        StringBuilder sb = new StringBuilder();
        
        for(String letter : letters) {
            sb.append(letter);
        }
        
        return sb.toString();
    }
}