class Solution {
    public int solution(String before, String after) {
        String[] before_letters = before.split("");
        String[] after_letters = after.split("");
        
        for(int i = 0; i < before.length(); i++) {
            for(int j = 0; j < after.length(); j++) {
                if(before_letters[i].equals(after_letters[j])) {
                    before_letters[i] = "";
                    after_letters[j] = "";
                }
            }
        }
        
        return letterIsEmpty(before_letters);
    }
    
    public int letterIsEmpty(String[] letters) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< letters.length; i++) {
            sb.append(letters[i]);
        }
        
        // isEmpty() - cannot find symbol
        if(sb.toString().equals("")) {
            return 1;
        }
        return 0;
    }
}