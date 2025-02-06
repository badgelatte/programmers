class Solution {
    public int solution(int num, int k) {
        int[] nums = numArray(num);
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == k) {
                return i + 1;
            }
        }
        
        return -1;
    }
    
    public int[] numArray (int num) {
        int length = String.valueOf(num).length();
        int[] nums = new int[length];
        
       for(int i = length - 1; i >= 0; i--) {
            nums[i] = num % 10;
            num /= 10;
        }
        
        return nums;
    }
}