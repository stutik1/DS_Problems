package slidingWindow;

import java.util.Arrays;

public class AverageContiguousSubarray {

    public static double[] method1(int[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j++)
                sum = sum + arr[j];
            result[i] = sum / k;
        }
        return result;
    }

    ///////

    public static double[] bySlidingWindowMethod(int[] arr, int k) {
        double[] results = new double[arr.length - k + 1];
        double sum = 0;
        double current_sum = 0;
        for (int i = 0; i <= k; i++) {
            sum = sum + arr[i];
        }

        for (int i = 1; i < arr.length - k; i++) {
            current_sum = current_sum - arr[i - 1] + arr[i + k - 1];
            results[i] = current_sum / k;
        }

        return results;
    }

    public static void main(String[] args) {
        double result[] = AverageContiguousSubarray.method1(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        System.out.println(Arrays.toString(result));

        double results[] = AverageContiguousSubarray.bySlidingWindowMethod(new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);
        System.out.println(Arrays.toString(result));


    }
}
