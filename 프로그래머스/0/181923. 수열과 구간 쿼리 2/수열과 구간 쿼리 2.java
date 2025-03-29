class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            answer[i] = findMin(arr, queries[i]);
        }
        
        return answer;
    }
    
    public int findMin(int[] arr, int[] query) {
        int min = 1000001;
        
        for(int i = query[0]; i < query[1] + 1; i++) {
            if(query[2] < arr[i] && min > arr[i]) {
                min = arr[i];
            }
        }
        
        if(min == 1000001) {
            min = -1;
        }

        return min;
    }
}