import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int count = 0;
        int num = 0;
        List<Integer> list = new ArrayList<>();

        while(num < l) {
            num = makeBinary(count++) * 5;
        }
        
        while(num <= r) {
            list.add(num);
            num = makeBinary(count++) * 5;
        }

        return listToArr(list);
    }
    
    public int makeBinary(int num) {
        String binaryStr = Integer.toBinaryString(num);
        return Integer.parseInt(binaryStr);
    }
    
    public int[] listToArr(List<Integer> list) {
        if(list.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}