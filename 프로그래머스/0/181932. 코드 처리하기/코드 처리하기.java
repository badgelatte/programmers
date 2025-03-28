class Solution {
    public String solution(String code) {
        int mode = 0;
        String[] codes = code.split("");
        String ret = "";
        
        for(int i = 0; i < codes.length; i++) {
            if(mode == 0) {
                if(codes[i].equals("1")) {
                    mode = 1;
                }
                else if(i % 2 == 0) {
                    ret += codes[i];
                }
            }
            
            else if(mode == 1) {
                if(codes[i].equals("1")) {
                    mode = 0;
                }
                else if(i % 2 == 1) {
                    ret += codes[i];
                }
            }
        }
        
        if(ret.isEmpty()) {
            return "EMPTY";
        }
        
        return ret;
    }
}