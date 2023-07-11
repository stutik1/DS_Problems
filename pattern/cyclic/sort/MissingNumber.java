package pattern.cyclic.sort;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1 && arr[i] <= arr.length) {
                int index = arr[i] - 1;
                int x = arr[i];
                arr[i] = arr[index];
                arr[index] = x;
            } else {
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 2, 1, 7};
        System.out.println(MissingNumber.missingNumber(arr));
    }
}
