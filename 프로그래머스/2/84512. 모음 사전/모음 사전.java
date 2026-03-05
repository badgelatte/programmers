import java.util.List;
import java.util.ArrayList;

class Solution {
    List<String> list = new ArrayList<>();
    String[] gathers = new String[]{"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        putGather();
        return list.indexOf(word) + 1;
    }

    public void putGather() {
        for (int i = 0; i < gathers.length; i++) {
            dfs(gathers[i]);
        }
    }

    public void dfs(String str) {
        if (str.length() > gathers.length) {
            return;
        }

        if (!list.contains(str)) {
            list.add(str);
        }

        for (String gather : gathers) {
            dfs(str + gather);
        }
    }
}