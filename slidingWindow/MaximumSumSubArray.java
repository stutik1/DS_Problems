package slidingWindow;

public class MaximumSumSubArray {
    public static int byBruteForceApproach(int[] arr, int k) {
        int maxSum = 0;

        for (int i = 0; i < arr.length - k; i++) {
            int current_sum = 0;
            for (int j = i; j < i + k; j++) {
                current_sum = current_sum + arr[j];
                if (current_sum > maxSum) {
                    maxSum = current_sum;
                }
            }
        }
        return maxSum;
    }

    ///////////////

    public static int bySlidingWindow(int[] arr, int k) {
        int maxSum = 0;
        int current_sum = 0;

        for (int i = 0; i <= k; i++) {
            current_sum = current_sum + arr[i];
        }
        maxSum = Math.max(maxSum, current_sum);

        for (int i = k; i < arr.length; i++) {
            current_sum = 0;
            current_sum = current_sum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, current_sum);

        }
        return maxSum;
    }


    public static int bySlidingWindow2(int[] arr, int k) {
        int maxSum ;
        int currentSum = 0;

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;

        // Slide the window through the array
        for (int i = k; i < arr.length; i++) {
            // Subtract the element going out of the window
            // Add the element coming into the window
            currentSum = currentSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(MaximumSumSubArray.byBruteForceApproach(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println(MaximumSumSubArray.bySlidingWindow(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println(MaximumSumSubArray.bySlidingWindow2(new int[]{2, 1, 5, 1, 3, 2}, 3));

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(byBruteForceApproach(arr, k));

    }
}
