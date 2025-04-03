import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortArr = emergency.clone();
        Arrays.sort(sortArr);
        toString(sortArr);
        int length = emergency.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(emergency[i] == sortArr[j]) {
                    emergency[i] = length - j;
                    break;
                }
            }
        }
        toString(emergency);
        return emergency;
    }
    
    public void toString(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}