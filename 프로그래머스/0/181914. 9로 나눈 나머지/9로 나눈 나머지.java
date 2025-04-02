class Solution {
    public int solution(String number) {
        String[] nums = number.split("");
        int answer = 0;
        
        for(String num : nums) {
            answer += Integer.parseInt(num);
        }
        
        return answer % 9;
    }
}