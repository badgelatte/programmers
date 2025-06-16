class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        
        for(String str : strArr) {
            arr[str.length()]++;
        }
        
        return maxLen(arr);
    }
    
    public int maxLen(int[] arr) {
        int max = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[max] <= arr[i]) {
                max = i;
            }
        }
        
        return arr[max];
    }
}