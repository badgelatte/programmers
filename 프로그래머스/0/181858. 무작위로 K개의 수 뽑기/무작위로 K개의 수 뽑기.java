import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList();
        int[] result = new int[k];
        
        for(int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        
        return fillArray(list, result);
    }
    
    public int[] fillArray(List<Integer> list, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(list.size() > i) {
                arr[i] = list.get(i);
            }
            else {
                arr[i] = -1;
            }
        }
        
        return arr;
    }
}