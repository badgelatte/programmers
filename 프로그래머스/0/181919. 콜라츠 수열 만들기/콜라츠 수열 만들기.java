import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList();
        
        while(n != 1) {
            if(n % 2 == 0) {
                list.add(n);
                n /= 2;
            }
            else {
                list.add(n);
                n = 3 * n + 1;
            }
        }
        list.add(1);
        
        return listToArr(list);
    }
    
    public int[] listToArr(List<Integer> list) {
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}