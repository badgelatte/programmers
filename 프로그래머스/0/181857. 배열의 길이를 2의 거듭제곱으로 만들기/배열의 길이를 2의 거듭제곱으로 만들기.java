class Solution {
    public int[] solution(int[] arr) {
        int count = findPowerOf2(arr.length);
        int[] result = new int[count];
        
        System.arraycopy(arr, 0, result, 0, arr.length);
        
        return result;
    }
    
    public int findPowerOf2 (double num) {
        int exponent = 0;
        double power = 0;
        
        while(num > power) {
            power = Math.pow(2, exponent++);
        }
        
        return (int) power;
    }
}