class Solution {
    public int solution(String myString, String pat) {
        String[] arr = myString.split("");
        
        arr = ChangeAB(arr);
        
        myString = arrToStr(arr);
        
        if(myString.contains(pat)) {
            return 1;
        }
        
        return 0;
    }
    
    public String[] ChangeAB(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("A")) {
                arr[i] = "B";
            }
            else {
                arr[i] = "A";
            }
        }
        
        return arr;
    }
    
    public String arrToStr(String[] arr) {
        String str = "";
        
        for(String letter : arr) {
            str += letter;
        }
        
        return str;
    }
}