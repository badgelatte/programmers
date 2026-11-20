class Solution {
    public int[] solution(String s) {
        int cntZero = 0;
        int count = 0;
        int sLen = s.length();
        
        while(!s.equals("1")) {
            s = s.replaceAll("0", "");
            cntZero += sLen - s.length();
            s = Integer.toBinaryString(s.length());
            sLen = s.length();
            count++;
        }
        
        return new int[] {count, cntZero};
    }
}