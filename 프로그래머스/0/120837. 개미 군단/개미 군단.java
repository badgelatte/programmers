class Solution {
    public int solution(int hp) {
        int ants = 0;
        
        ants += hp / 5;
        hp = hp % 5;
        
        ants += hp / 3;
        hp = hp % 3;
        
        ants += hp;
        
        return ants;
    }
}