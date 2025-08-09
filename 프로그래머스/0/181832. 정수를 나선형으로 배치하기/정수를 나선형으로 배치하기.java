class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        int row = 0;
        int column = 0;
        
        boolean isOdd = true;
        int way = 1;
        int stepCount = n;

        for(int i = 1; i <= n * n; i++) {
            if(calculateTurnPointStep(n, stepCount, isOdd) == i) {
                if(n != stepCount) {
                    if(isOdd) {
                        isOdd = false;
                    }
                    else {
                        stepCount--;
                        isOdd = true;
                    }
                }
                else {
                    stepCount--;
                }
                way++;
                if(way >=5) {
                    way = 1;
                }
            }
            
            if(way == 1) { // right
                arr[row][column++] = i;
            }
            else if(way == 2) { // down
                arr[row++][column] = i;
            }
            else if(way == 3) { // left
                arr[row][column--] = i;
            }
            else if(way == 4) { // up
                arr[row--][column] = i;
            }
        }

        return arr;
    }
    
    // 칸 이동 횟수 -> n 1번, n-1 2번, n-2 2번 ... 1 2번 이동
    public int calculateTurnPointStep(int n, int num, boolean isOdd) {
        int sum = n;
        
        if(sum == num) {
            return sum;
        }

        if(isOdd) {
            sum -= num;
        }

        for(;num < n; num++) {
            sum += num * 2;
        }

        return sum;
    }
}