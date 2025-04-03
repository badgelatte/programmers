class Solution {
    public int solution(int[] array) {
        int length = array.length;
        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[length/2];
    }
}