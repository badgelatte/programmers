class Solution {
    public String solution(String my_string, int s, int e) {
        char[] charArr = my_string.toCharArray();
        char temp = ' ';
        int len = arrLen(e - s);
        
        for(int i = 0; i < len; i++) {
            temp = charArr[s+i];
            charArr[s+i] = charArr[e-i];
            charArr[e-i] = temp;
        }
        
        return arrToStr(charArr);
    }
    
    public int arrLen(int num) {
        if(num % 2 == 0){
            return num / 2;
        }
        
        return num / 2 + 1;
    }
    
    public String arrToStr(char[] arr) {
        String str = "";
        
        for(char a : arr) {
            str += a;
        }
        
        return str;
    }
}