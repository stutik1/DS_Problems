package pattern.cyclic.sort;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumber {

    public static List<Integer> byCyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != arr[arr[i]-1]) {
                int index = arr[i] - 1;
                int x = arr[i];
                arr[i] = arr[index];
                arr[index] = x;
            } else {
                i++;
            }
        }
        List<Integer> missingNumber = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                missingNumber.add(i + 1);
            }
        }
        return missingNumber;
    }

    public static List<List<Integer>> byCyclicSortApproach(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != arr[arr[i]-1]) {
                int index = arr[i] - 1;
                int x = arr[i];
                arr[i] = arr[index];
                arr[index] = x;
            } else {
                i++;
            }
        }
        List<Integer> missingNumber = new ArrayList<>();

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                missingNumber.add(i + 1);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add( missingNumber);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,4,4,3,2};
        System.out.println(FindAllMissingNumber.byCyclicSort(arr));
        System.out.println(FindAllMissingNumber.byCyclicSortApproach(arr));

    }
}
