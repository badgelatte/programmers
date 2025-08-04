class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int max = getMaxNum(row, column);
        
        if(max == -1) {
            return arr;
        }
        
        int[][] result = new int[max][max];
        
        return copyArr(arr, result);
    }
    
    public int getMaxNum(int num1, int num2) {
        if(num1 == num2) {
            return -1;
        }
        else if(num1 > num2) {
            return num1;
        }
        
        return num2;
    }
    
    public int[][] copyArr(int[][] arr, int[][] result) {
        int row = arr.length;
        int column = arr[0].length;
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                result[i][j] = arr[i][j];
            }
        }
        
        return result;
    }
}