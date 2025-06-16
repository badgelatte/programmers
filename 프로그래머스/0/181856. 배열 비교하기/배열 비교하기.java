class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int compareLen = compare2Nums(arr1.length, arr2.length);
        
        if(compareLen == 0) {
            int arr1All = addElement(arr1);
            int arr2All = addElement(arr2);
            
            return compare2Nums(arr1All, arr2All);
        }
        
        return compareLen;
    }
    
    public int compare2Nums(int num1, int num2) {
        if(num1 > num2) {
            return 1;
        }
        
        if(num1 < num2) {
            return -1;
        }
        
        return 0;
    }
    
    public int addElement(int[] arr) {
        int sum = 0;
        
        for(int num : arr) {
            sum += num;
        }
        
        return sum;
    }
}