import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] nNext = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] nums = Arrays.copyOfRange(num_list, 0,n);
        System.arraycopy(nNext, 0, num_list, 0, nNext.length);
        System.arraycopy(nums, 0, num_list, nNext.length, nums.length);
        
        return num_list;
    }
}