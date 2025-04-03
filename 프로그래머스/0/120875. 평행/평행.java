class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        // 1, 2
        double row1 = (dots[1][0] - dots[0][0]);
        double column1 = dots[1][1] - dots[0][1];
        
        // 3, 4
        double row2 = dots[3][0] - dots[2][0];
        double column2 = dots[3][1] - dots[2][1];
        
        if((double)(column1 / row1) == (double)(column2 / row2)) {
            return 1;
        }
        
        // 1, 3
        row1 = dots[2][0] - dots[0][0];
        column1 = dots[2][1] - dots[0][1];
        
        // 2, 4
        row2 = dots[3][0] - dots[1][0];
        column2 = dots[3][1] - dots[1][1];
        
        if((double)(column1 / row1) == (double)(column2 / row2)) {
            return 1;
        }
        
        // 1, 4
        row1 = dots[3][0] - dots[0][0];
        column1 = dots[3][1] - dots[0][1];
        
        // 2, 3
        row2 = dots[2][0] - dots[1][0];
        column2 = dots[2][1] - dots[1][1];
        
        if((double)(column1 / row1) == (double)(column2 / row2)) {
            return 1;
        }
        
        return answer;
    }
}