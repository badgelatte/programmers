class Solution {
    public int solution(String num_str) {
        String[] numStrs = num_str.split("");
        int num = 0;
        
        for(int i = 0; i < numStrs.length; i++) {
            num += Integer.valueOf(numStrs[i]);
        }
        
        return num;
    }
}