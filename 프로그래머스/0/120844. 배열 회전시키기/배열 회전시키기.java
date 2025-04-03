class Solution {
    public int[] solution(int[] numbers, String direction) {
        int numbers_last = numbers.length - 1;
        
        if(direction.equals("left")) {
            int corner = numbers[0];
            for(int i = 0; i < numbers_last; i++) {
                numbers[i] = numbers[i+1];
            }
            numbers[numbers_last] = corner;
        }
        
        if(direction.equals("right")) {
            int corner = numbers[numbers_last];
            for(int i = numbers_last; i > 0; i--) {
                numbers[i] =numbers[i-1];
            }
            numbers[0] = corner;
        }
        return numbers;
    }
}