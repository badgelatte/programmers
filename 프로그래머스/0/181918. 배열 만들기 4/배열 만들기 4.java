import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList();
        int i = 0;
        
        while(i < arr.length) {
            int last = stk.size() - 1;
            
            if(stk.isEmpty()) {
                stk.add(arr[i++]);
            }
            else if(stk.get(last) < arr[i]) {
                stk.add(arr[i++]);
            }
            else if(stk.get(last) >= arr[i]) {
                stk.remove(last);
            }
        }
        
        return listToArr(stk);
    }
    
    public int[] listToArr(List<Integer> list) {
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}