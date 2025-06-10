class Solution {
    public int solution(String myString, String pat) {
        boolean isContain = false;
        int result = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        isContain = myString.contains(pat);
        
        if(isContain) {
            result = 1;
        }
        
        return result;
    }
}