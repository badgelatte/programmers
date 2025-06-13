import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        if(myString.charAt(0) == 'x') {
            myString = myString.substring(1);
        }
        
        myString = myString.replaceAll("x+", "x");
        String[] strArr = myString.split("x");
        
        Arrays.sort(strArr);
        
        return strArr;
    }
}