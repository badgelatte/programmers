class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x");
        char last = myString.charAt(myString.length() - 1);
        int arrlength = strArr.length;
        
        if(last == 'x') {
            arrlength++;
        }
        
        int[] intArr = new int[arrlength];
        
        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = strArr[i].length();
        }
        
        return intArr;
    }
}