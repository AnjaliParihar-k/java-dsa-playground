/**
 * Kadane Algorithm
 * Time Complexity - O(n) - most optimized way of finding max sum of sub array and printing the subarray.
 */

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {3, -4, 5, 4, -1, 7, 6, -8};
        int maxSum = 0, currSum = 0, maxLength = 0, end = 0, start = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            // maxSum = Math.max(currSum, maxSum);
            if (currSum > maxSum) {
                maxSum = currSum;
                maxLength++;
                end = i;
            }
            if (currSum < 0) {
                currSum = 0;
            }

        }
        start = end - maxLength + 1;
        System.out.println("Maximum Sum: " + maxSum + " maximum Length: " + maxLength);
        System.out.println("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
