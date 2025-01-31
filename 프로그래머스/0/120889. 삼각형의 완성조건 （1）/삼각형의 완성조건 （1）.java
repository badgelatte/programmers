class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int add = 0;
        
        for(int side : sides) {
            if(max < side) {
                max = side;
            }
            add += side;
        }
        
        if(add - max > max) {
            return 1;
        }
        return 2;
    }
}