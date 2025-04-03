class Solution {
    public int solution(int[] array, int height) {
        int ranking = array.length;
        
        array = sortArr(array);
        
        for(int i = 0; i < array.length; i++) {
            if(height < array[i]) {
                ranking = i;
                break;
            }
        }
        
        return array.length - ranking;
    }
    
    public int[] sortArr(int[] arr) {
        int temp = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }
}