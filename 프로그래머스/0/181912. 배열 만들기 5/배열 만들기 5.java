import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String intStr : intStrs) {
            String str = "";
            for(int i = s;i < s+l;i++) {
                str += intStr.charAt(i);
            }
            int num = strToInt(str);
            if(num > k) {
                list.add(num);
            }
        }
        
        return listToArr(list);
    }
    
    public int strToInt(String str) {
        return Integer.parseInt(str);
    }
    
    public int[] listToArr(List<Integer> list) {
        int[] results = new int[list.size()];
        
        for(int i = 0;i < list.size(); i++) {
            results[i] = list.get(i);
        }
        
        return results;
    }
}