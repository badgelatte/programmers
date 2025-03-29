import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] result = new int[length + 1];
        
        System.arraycopy(num_list, 0, result, 0, length);

        if(num_list[length - 1] > num_list[length - 2]) {
            result[length] = num_list[length - 1] - num_list[length - 2];
        }
        else {
            result[length] = num_list[length - 1] * 2;
        }
        
        return result;
    }
}