class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] result = {};
        
        switch(n){
            case 1:
                result = makeArr(0, slicer[1], 1, num_list);
                break;
            case 2:
                result = makeArr(slicer[0], num_list.length - 1, 1, num_list);
                break;
            case 3:
                result = makeArr(slicer[0], slicer[1], 1, num_list);
                break;
            case 4:
                result = makeArr(slicer[0], slicer[1], slicer[2], num_list);
                break;
        }
            
        
        
        return result;
    }
    
    public int[] makeArr(int start, int end, int value, int[] numList) {
        int length = 0;
        if((end - start + 1) % value == 0) {
            length = (end - start + 1) / value;
        }
        else {
            length = (end - start + 1) / value + 1;
        }
        int[] arr = new int[length];
        
        for(int i = 0; start <= end; i++) {
            arr[i] = numList[start];
            start += value;
        }
        
        return arr;
    }
}