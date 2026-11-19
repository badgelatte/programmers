import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map <Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        for (int i = 0; i < tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                int value = map.get(tangerine[i]) + 1;
                map.put(tangerine[i], value);
            } else {
                map.put(tangerine[i], 1);
            }
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.reverseOrder());
        
        int size = 0;
        
        while (k > size){
            size += list.remove(0);
            result++;
        }
        return result;
    }
}