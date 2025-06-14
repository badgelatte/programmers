import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList();
        
        for(int i = 0; i < arr.length;) {
            int last = stk.size() - 1;
            
            if(stk.isEmpty()) {
                stk.add(arr[i++]);
            }
            else if(stk.get(last) == arr[i]) {
                stk.remove(last);
                i++;
            }
            else if(stk.get(last) != arr[i]) {
                stk.add(arr[i++]);
            }
        }
        
        return listToArr(stk);
    }
    
    public int[] listToArr(List<Integer> list) {
        if(list.isEmpty()) {
            return new int[] {-1};
        }
        
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}