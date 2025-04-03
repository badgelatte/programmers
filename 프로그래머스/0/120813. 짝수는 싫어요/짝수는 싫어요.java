class Solution {
    public int[] solution(int n) {
        int length = n % 2 == 0 ? n/2 : n/2+1;
        int[] array = new int[length];
        int count = 0;
        
        while(++count <= length) {
            array[count-1] = 2*count-1;
        }
        return array;
    }
}