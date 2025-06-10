class Solution {
    public int solution(int[] arr) {
        boolean change = true;
        int count = 0;
        
        while(change) {
            change = false;
            count++;
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                    change = true;
                }
                else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                    change = true;
                }
            }
        }
        
        return --count;
    }
}