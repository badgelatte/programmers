class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        int count = 0;
        
        for(int i = 0; i < num; i++) {
            count += i;
        }
        
        int start = (total - count) / num;
        
        for(int i = 0; i < num; i++) {
            result[i] = start + i;
        }
        
        return result;
    }
}