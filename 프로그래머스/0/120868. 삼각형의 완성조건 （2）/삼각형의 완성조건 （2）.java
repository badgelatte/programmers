import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
            Arrays.sort(sides);
            answer += sides[0];
            answer += sides[0] - 1;
            return answer;
    }
}