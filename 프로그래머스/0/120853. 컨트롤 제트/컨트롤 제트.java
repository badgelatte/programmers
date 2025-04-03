class Solution {
    public int solution(String s) {
        int count = 0;
        String[] ss = s.split(" ");
        
        for(int i = 0; i < ss.length; i++) {
            if(ss[i].equals("Z")) {
                count -= Integer.parseInt(ss[i-1]);
                continue;
            }
            count +=  Integer.parseInt(ss[i]);
        }
        
        return count;
    }
}