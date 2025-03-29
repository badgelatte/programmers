class Solution {
    public int solution(int n, String control) {
        char[] letters = control.toCharArray();
        
        for(char letter : letters) {
            n += moveCount(letter);
        }
        
        return n;
    }
    
    public int moveCount(char control) {
        if(control == 'w') {
            return 1;
        }
        if(control == 's') {
            return -1;
        }
        if(control == 'd') {
            return 10;
        }
        return -10;
    }
}