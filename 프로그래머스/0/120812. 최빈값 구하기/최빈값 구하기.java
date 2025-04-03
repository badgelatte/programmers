class Solution {
    public int solution(int[] array) {
        int[] newArray = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            int num = array[i];
            newArray[num]++;
        }
        
        int answer = 0;
        boolean maxIsSeveral = false;
        
        for(int i = 1; i < newArray.length; i++) {
            if(newArray[answer] == newArray[i]) {
                maxIsSeveral = true;
            }
            if(newArray[answer] < newArray[i]) {
                answer = i;
                maxIsSeveral = false;
            }
        }
        
        if(maxIsSeveral) {
            return -1;
        }
        return answer;
    }
}