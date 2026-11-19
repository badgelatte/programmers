import java.lang.StringBuilder;

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int len = phone_number.length() - 4;
        
        while (len-- > 0) {
            sb = sb.append("*");
        }
        
        sb = sb.append(phone_number.substring(phone_number.length() - 4));
        return sb.toString();
    }
}