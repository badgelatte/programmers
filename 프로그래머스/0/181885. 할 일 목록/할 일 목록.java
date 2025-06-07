import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList();
        
        for(int i = 0; i < finished.length; i++) {
            if(finished[i] == false) {
                list.add(todo_list[i]);
            }
        }
        
        return listToArr(list);
    }
    
    public String[] listToArr(List<String> list) {
        String[] arr = new String[list.size()];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}