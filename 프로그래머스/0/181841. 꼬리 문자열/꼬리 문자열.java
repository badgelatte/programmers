class Solution {
    public String solution(String[] str_list, String ex) {
        String strTail = "";
        
        for(String str : str_list) {
            if(!str.contains(ex)) {
                strTail += str;
            }
        }
        
        return strTail;
    }
}