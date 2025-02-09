class Solution {
    public int solution(int[][] dots) {
        int width = 0;
        int height = 0;
        if(dots[0][0] != dots[1][0]) {
            width = dots[1][0] - dots[0][0];
            height = dots[3][1] - dots[0][1];
        }
        else {
            width = dots[3][0] - dots[0][0];
            height = dots[1][1] - dots[0][1];
        }
        return Math.abs(width * height);
    }
}