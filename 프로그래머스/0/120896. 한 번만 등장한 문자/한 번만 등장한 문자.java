import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Set<String> sSet = new TreeSet<>(Arrays.asList(s.split("")));
        
        for (String letter : sSet) {
            if(s.indexOf(letter) == s.lastIndexOf(letter)) {
                answer.append(letter);            
            }
        }
        
        return answer.toString();
    }
}