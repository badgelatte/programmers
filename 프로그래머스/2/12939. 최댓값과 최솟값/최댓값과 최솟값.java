import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] splitS = s.split(" ");
        int[] nums = new int[splitS.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.valueOf(splitS[i]);
        }

        Arrays.sort(nums);
        
        return nums[0] + " " + nums[nums.length - 1];
    }
}