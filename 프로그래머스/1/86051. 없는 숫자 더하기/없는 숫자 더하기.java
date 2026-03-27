import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int count = 0;
        int sum = 0;
        
        Arrays.sort(numbers);
        
        for (int number : numbers) {
            while (count++ != number) {
                sum += count - 1;
            }
        }
        
        while (count != 10) {
            sum += count++;
        }
        
        return sum;
    }
}