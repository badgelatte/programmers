class Solution {
    public int solution(String my_string) {
        char[] charList = my_string.toCharArray();
        int temp = 0;
        int result = 0;
        
        for(int i = 0; i < charList.length; i++) {
            if(i == charList.length - 1) { 
                if(Character.isDigit(charList[i])) {
                    result += temp * 10 + (charList[i] - 48);
                }
            }
            
            else if(Character.isDigit(charList[i])) {
                if(Character.isDigit(charList[i+1])) {
                    temp = temp * 10 + (charList[i] - 48);
                }
                else {
                    result += temp * 10 + (charList[i] - 48);
                    temp = 0;
                }
            }
        }
        
        return result;
    }
}