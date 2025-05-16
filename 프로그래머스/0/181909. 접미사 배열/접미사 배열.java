import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            String str = my_string.substring(i);
            list.add(str);
        }
        
        Collections.sort(list);
        
        return listToArr(list);
    }
    
    public String[] listToArr(List<String> list) {
        String[] arr = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}