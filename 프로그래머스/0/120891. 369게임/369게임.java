class Solution {
    public int solution(int order) {
        int count = 0;
        
        while(order > 0) {
            if(order % 10 == 0) {
                order = order / 10;
                continue;
            }
            
            if((order % 10) % 3 == 0) {
                count++;
            }
            
            order = order / 10;
        }
        
        return count;
    }
}