public class LongestSubArraySumZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 3, -2, 4, -2, 2};
        int targetSum = 0, maxLength = 0, currSum, currLength = 0;
        int maxStart = 0,  maxEnd = 0;
        for (int start = 0; start < arr.length && (arr.length - start) > maxLength; start++) {
            currSum = 0;
            for (int end = start; end < arr.length; end++) {
                currSum = currSum + arr[end];
                if (currSum == targetSum) {
                    currLength = end - start + 1;
                    if (currLength > maxLength) {
                        maxStart = start;
                        maxEnd = end;
                        maxLength = currLength;
                    }
                }
            }
        }
        System.out.println("MaxLength: " + maxLength + ", Start: " + maxStart + ", End: " + maxEnd);
    }
}
