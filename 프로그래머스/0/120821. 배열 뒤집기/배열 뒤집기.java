class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int num1 = 0;
        
        for(int i = 0; i < length/2; i++) {
            num1 = num_list[i];
            num_list[i] = num_list[length - i -1];
            num_list[length -i -1] = num1;
        }
        return num_list;
    }
}