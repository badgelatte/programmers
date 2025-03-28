class Solution {
    public int solution(int a, int b, int c) {
        boolean a_b = (a == b) ? true : false;
        boolean b_c = (b == c) ? true : false;
        boolean a_c = (a == c) ? true : false;
        
        if(!(a_b || b_c || a_c)) {
            return a + b + c;
        }
        
        if(a_b && b_c && a_c) {
            return (a + b + c) 
                * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)) 
                * (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
        }
        
        return (a + b + c) 
            * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
    }
}