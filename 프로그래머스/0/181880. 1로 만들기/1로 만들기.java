class Solution {
    public int solution(int[] num_list) {
        boolean change = true;
        int count = 0;
        
        while(change) {
            change = false;
            
            for(int i = 0; i < num_list.length; i++) {
                if(num_list[i] == 1) {
                    continue;
                }
            
                if(num_list[i] % 2 == 0) {
                    num_list[i] = num_list[i] / 2;
                    change = true;
                    count++;
                }
                else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    change = true;
                    count++;
                }
            }
        }
        
        return count;
    }
}