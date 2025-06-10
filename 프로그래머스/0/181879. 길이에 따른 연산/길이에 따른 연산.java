class Solution {
    public int solution(int[] num_list) {
        if(num_list.length >= 11) {
            return addAll(num_list);
        }
        
        return mulAll(num_list);
    }
    
    public int addAll(int[] num_list) {
        int result = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            result += num_list[i];
        }
        
        return result;
    }
    
    public int mulAll(int[] num_list) {
        int result = 1;
        
        for(int i = 0; i < num_list.length; i++) {
            result *= num_list[i];
        }
        
        return result;
    }
}