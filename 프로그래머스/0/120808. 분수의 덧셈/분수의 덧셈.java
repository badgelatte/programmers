class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + denom1 * numer2;
        int denom = denom1 * denom2;
        int common = 1;
    
        for(int i = 2; i <= denom; i++) {
            if(numer % i == 0 && denom % i == 0) {
                common = i;
            }
        }
        
        return new int[]{numer/common, denom/common};

    }
}