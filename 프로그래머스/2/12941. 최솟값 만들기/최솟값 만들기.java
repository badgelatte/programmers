import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int result = 0;
        
        Arrays.sort(A);
        B = descendingSort(B);
        
        for(int i = 0; i < A.length; i++) {
            result += A[i] * B[i];
        }
        
        return result;
    }
    
    public int[] descendingSort(int[] arr) {
        int[] arrDes = new int[arr.length];
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            arrDes[i] = arr[arr.length - 1 - i];
        }
        
        return arrDes;
    }
}