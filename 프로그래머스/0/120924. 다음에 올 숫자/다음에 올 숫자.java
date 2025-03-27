class Solution {
    public int solution(int[] common) {
        int last = common.length - 1;
        
        if(2 * common[1] - common[0] == common[2]) {
            return common[last] + (common[1]-common[0]);
        }
        
        return common[last] * (common[1]/common[0]);
    }
}