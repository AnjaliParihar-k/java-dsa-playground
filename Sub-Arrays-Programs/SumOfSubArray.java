/**
 * Program to find sum of subarray which equals to 8
 */
public class SumOfSubArray {
    public static void main(String[] args) {
        int target = 8;
        int[] arr = {5, 3, 4, 2, 8, 6};
        bruteForceApproach(arr, target);
        slidingWindowApproach(arr, target);
    }
    /**
     *
     * Using Brute force method
     * Complexity 0(n^2)
     */
    private static void bruteForceApproach(int[] arr, int target) {
        int sum;
        for (int start = 0; start < arr.length; start++) {
            sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum = sum + arr[end];
                if (sum == target) {
                    System.out.print("SubArray: ");
                    for (int k = start; k <= end; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    /**
     *
     * Using Sliding window method
     * Complexity 0(n)
     */
    private static void slidingWindowApproach(int[] arr, int target) {
        int sum = 0;
        int startIndex = 0;
        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];
            while (sum > target) {
                sum = sum - arr[startIndex];
                startIndex++;
            }
            if (sum == target) {
                System.out.print("SubArray ");
                for (int i = startIndex; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
