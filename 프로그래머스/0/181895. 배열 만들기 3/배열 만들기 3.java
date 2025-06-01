import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList();
        
        for(int[] interval : intervals) {
            for(int i = interval[0]; i <= interval[1]; i++) {
                list.add(arr[i]);
            }
        }
        
        return listToArr(list);
    }
    
    public int[] listToArr(List<Integer> list) {
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}