class Solution {
    public String solution(String polynomial) {
        String[] polynomials = polynomial.split(" ");
        String[] result = {"0x", "0"};
        
        for(int i = 0; i < polynomials.length; i+=2) {
            if(polynomials[i].contains("x")) {
                result[0] = addPoly(result[0], polynomials[i]);
            }
            else {
                result[1] = addPoly(result[1], polynomials[i]);
            }
        }
        
        return toStringPoly(result);
    }
    
    public String addPoly(String input, String poly) {
        if(!poly.contains("x")) {
            int num = Integer.parseInt(input) + Integer.parseInt(poly);
            return String.valueOf(num);
        }
        
        if(poly.equals("x")) {
            poly = "1x";
        }
        
        int num = Integer.parseInt(input.replace("x","")) + Integer.parseInt(poly.replace("x",""));
        return num + "x";
    }
    
    public static String toStringPoly(String[] arr) {
        if(arr[0].equals("1x")) {
            arr[0] = "x";
        }
        
        if(arr[0].equals("0x")) {
            return arr[1];
        }
        
        if(arr[1].equals("0")) {
            return arr[0];
        }
        
        return arr[0] +  " + " + arr[1];
    }
}