package pattern.cyclic.sort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbers {
    public static List<Integer> findAllDuplicateNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                int index = arr[i] - 1;
                int x = arr[i];
                arr[i] = arr[index];
                arr[index] = x;
            } else {
                i++;
            }
        }

        List<Integer> duplicateNumber = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                duplicateNumber.add(arr[i]);
            }
        }
        return duplicateNumber;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 4, 3, 2};
        System.out.println(FindAllDuplicateNumbers.findAllDuplicateNumbers(arr));
    }
}
