import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String word : dic) {
            String[] words = word.split("");
            if(useSpells(new ArrayList<>(List.of(spell)), words)) {
                return 1;
            }
        }
        
        return answer;
    }
    
    public boolean useSpells (List<String> spell, String[] words) {
        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < spell.size(); j++) {
                if(words[i].equals(spell.get(j))) {
                    spell.remove(spell.get(j));
                }
            }
        }
        
        return spell.isEmpty();
    }
}