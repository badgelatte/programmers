class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int sum = 0;
        
        for(int num : num_list) {
            multiply *= num;
            sum += num;
        }
        
        if(multiply < sum * sum) {
            return 1;
        }
        return 0;
    }
}