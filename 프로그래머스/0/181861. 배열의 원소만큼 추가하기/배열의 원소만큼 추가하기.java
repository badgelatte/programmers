class Solution {
    public int[] solution(int[] arr) {
        int length = sumArr(arr);
        int[] result = new int[length];
        int now = 0;
        
        for(int i = 0; i < arr.length; i++) {
            result = addNum(now, arr[i], result);
            now += arr[i];
        }
        
        return result;
    }
    
    public int sumArr(int[] arr) {
        int count = 0;
        
        for(int num : arr) {
            count += num;
        }
        
        return count;
    }
    
    public int[] addNum(int start, int amount, int[] arr) {
        for(int i = start; i < start + amount; i++) {
            arr[i] = amount;
        }
        
        return arr;
    }
}