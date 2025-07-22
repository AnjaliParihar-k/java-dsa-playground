import java.util.*;

/**
 * Print count if the sum of sub array is negative
 */
public class NegativeSumOfSubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = scan.nextInt();
        int count = 0, sum ;
        int[] arr = new int[n];
        System.out.println("Enter Array element of size " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int start = 0; start < n; start++) {
            sum = 0;
            for (int end = start; end < n; end++) {
                sum = sum + arr[end];

                if (sum < 0) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }


}