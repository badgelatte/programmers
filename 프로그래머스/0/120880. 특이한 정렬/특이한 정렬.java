import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        sortByDistance(numlist, n);
        
        return adjustAndSort(numlist, n);
    }
    
    public int[] sortByDistance(int[] numlist, int n) {
        for(int i = 0; i < numlist.length; i++) {
            numlist[i] -= n;
        }
        
        Arrays.sort(numlist);
        
        return numlist;
    }
    
    public int[] adjustAndSort (int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        if(numlist[0] >= 0) {
            for(int i = 0; i < numlist.length; i++) {
                numlist[i] += n;
            }
            return numlist;
        }
        
        int min = 0;
        
        for(int i = 0; i < numlist.length; i++) {
            if(Math.abs(numlist[i]) < Math.abs(numlist[min])) {
                min = i;
            }
        }
        
        answer[0] = numlist[min] + n;
        int before = min - 1;
        int after = min + 1;
        
        for(int i = 1; i < numlist.length; i++) {
            if(before < 0) {
                answer[i] = numlist[after++] + n;
                continue;
            }
            if(after >= numlist.length) {
                answer[i] = numlist[before--] + n;
                continue;
            }
            
            if(Math.abs(numlist[before])  < numlist[after]) {
                answer[i] = numlist[before--] + n;
            } 
            else {
                answer[i] = numlist[after++] + n;
            }
        }
        return answer;
    }
}