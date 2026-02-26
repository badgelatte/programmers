import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        recursive("", numbers);
        
        Iterator<Integer> iterator = set.iterator();
        int number = 0;
        int count = 0;
        
        while(iterator.hasNext()) {
            number = iterator.next();
            if(isPrime(number)) {
                count++;
            }
        }
        
        return count;
    }
    
    public void recursive(String start, String end) {
        if(!start.equals("")) {
            set.add(Integer.valueOf(start));
        }
        
        for(int i = 0; i < end.length(); i++) {
            recursive(start + end.charAt(i), end.substring(0, i) + end.substring(i + 1));
        }
    }
    
    public boolean isPrime(int num) {
        int current = 1;
        
        if(num <= 1) {
            return false;
        }
        
        while(++current < num) {
            if(num % current == 0) {
                return false;
            }
        }
        
        return true;
    }
}