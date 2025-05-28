class Solution {
    public String solution(String my_string, int[] indices) {
        char[] strArr = my_string.toCharArray();
        
        for(int num : indices) {
            strArr[num] = ' ';
        }
        
        String str = charToStr(strArr);
        
        return str;
    }
    
    public String charToStr(char[] arr) {
        String str = "";
        
        for(char c : arr) {
            if(c == ' ') {
                continue;
            }
            str += c;
        }
        
        return str;
    }
}