class Solution {
    public int[] solution(int[] array) {
        int maxLoc = 0;
        
        for(int i = 1; i < array.length; i++) {
            if(array[i] > array[maxLoc]) {
                maxLoc = i;
            }
        }
        
        return new int[] {array[maxLoc], maxLoc};
    }
}