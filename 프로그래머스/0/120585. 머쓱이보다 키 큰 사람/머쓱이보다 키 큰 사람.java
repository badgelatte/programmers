import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int ranking = array.length;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            if(height < array[i]) {
                ranking = i;
                break;
            }
        }
        return array.length - ranking;
    }
}