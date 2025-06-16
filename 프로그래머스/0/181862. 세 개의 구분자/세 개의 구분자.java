import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList();
        list.add(myStr);
        
        list = splitStr(list, "a");
        list = splitStr(list, "b");
        list = splitStr(list, "c");
        
        return listToArr(list);
    }
    
    public List<String> splitStr(List<String> list, String pat) {
        int listSize = list.size();
        
        for(int i = 0; i < listSize; i++) {
            String str = list.remove(0); 
            String[] arr = str.split(pat);
            list = addArrToList(list, arr);
        }
        
        return list;
    }
    
    public List<String> addArrToList (List<String> list, String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].isEmpty()) {
                continue;
            }
            
            list.add(arr[i]);
        }
        
        return list;
    }
    
    public String[] listToArr(List<String> list) {
        if(list.isEmpty()) {
            return new String[] {"EMPTY"};
        }
        
        String[] arr = new String[list.size()];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}