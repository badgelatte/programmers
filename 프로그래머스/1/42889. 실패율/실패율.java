import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        int user = stages.length;
        for(int i = 1; i <= N; i++) {
            int count = 0;
            for (int stage : stages) {
                if (stage == i) {
                    count++;
                }
            }
            if (user == 0) {
               map.put(i, 0.0);
               continue;
            }
            map.put(i, (double) count / user);
            user = user - count;
        }

        int[] stageFailureRate = new int[N];
        for(int i = 0; i < stageFailureRate.length; i++) {
            double max = Collections.max(map.values());
            for(int key : map.keySet()) {
                if(map.get(key) == max) {
                    stageFailureRate[i] = key;
                    map.remove(key);
                    break;
                }
            }
        }

        return stageFailureRate;
    }
}