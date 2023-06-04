package patternTwoPointers;

import java.util.Arrays;

public class SquaringArray {
    public static int[] squaringArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }


    public static int[] sortedSquaresByTwoPointer(int[] arr) {
        int square[] = new int[arr.length];
        int i = arr.length -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] * arr[start] > arr[end] * arr[end]) {
                square[i] = arr[start] * arr[start];
                start++;
            } else {
                square[i] = arr[end] * arr[end];
                end--;
            }
            i--;
        }
        return square;

    }

    public static void main(String[] args) {
        int arr[] = {8, 2, 5, 9, 11};
        System.out.println(Arrays.toString(squaringArray(arr)));

        int result[] = SquaringArray.sortedSquaresByTwoPointer(new int[]{8, 2, 5, 9, 11});
        System.out.print(Arrays.toString(result));


    }
}
