class Solution {
    public int solution(String binomial) {
        int count = 0;
        
        String[] arr = binomial.split(" ");
        
        count = Integer.parseInt(arr[0]);
        
        if(arr[1].equals("+")) {
            count += Integer.parseInt(arr[2]);
        }
        if(arr[1].equals("-")) {
            count -= Integer.parseInt(arr[2]);
        }
        if(arr[1].equals("*")) {
            count *= Integer.parseInt(arr[2]);
        }
        
        return count;
    }
}