import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count-- > 0) {
            int arrLen = sc.nextInt();
            int[] nums = new int[arrLen];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.println(maxSubarraySum(nums));
        }
    }
    
    public static long maxSubarraySum(int arr[]){
        int max = arr[0];
        int addNums = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                addNums = plusNums(arr, i, j);
                if (max < addNums) {
                    max = addNums;
                }
            }
        }

        return max;
    }
    
    public static int plusNums(int[] arr, int start, int end) {
        int plusNums = 0;

        for (int i = start; i <= end; i++) {
            plusNums += arr[i];
        }

        return plusNums;
    }
}