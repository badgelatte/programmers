class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        
        if(direction.equals("left")) {
            int corner = numbers[0];
            for(int i = 0; i < length-1; i++) {
                numbers[i] = numbers[i+1];
            }
            numbers[length-1] = corner;
        }
        
        if(direction.equals("right")) {
            int corner = numbers[length-1];
            for(int i = 0; i < length-1; i++) {
                numbers[length-1-i] =numbers[length-2-i];
            }
            numbers[0] = corner;
        }
        return numbers;
    }
}