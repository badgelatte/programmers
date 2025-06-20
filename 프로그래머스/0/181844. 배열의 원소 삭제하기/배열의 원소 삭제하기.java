import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList();
        
        for(int i = 0; i < arr.length; i++) {
            boolean delete = isdelete_list(arr[i], delete_list);
            
            if(!delete) {
                list.add(arr[i]);
            }
        }
        
        return listToArr(list);
    }
    
    public boolean isdelete_list(int num, int[] delete_list){
        for(int deleteNum : delete_list) {
            if(num == deleteNum){
                return true;
            }
        }
        
        return false;
    }
    
    public int[] listToArr(List<Integer> list) {
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}