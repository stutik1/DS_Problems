package pattern.cyclic.sort;

public class MissingNumber {

    public static int missingNumberApproach1(int[] arr) {
        int n = arr.length + 1;

        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return sum;
    }

    public static int missingNumberApproach2(int[] arr) {
        int n = arr.length;
        int result = 0;
        int totalSum = 0;

        int sum = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum + arr[i];
            result = sum - totalSum;
        }
        return result;
    }

    public static int missingNumberCyclicSort(int[] arr) {
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
        System.out.println(MissingNumber.missingNumberApproach1(arr));

        System.out.println(MissingNumber.missingNumberApproach2(new int[]{3, 4, 6, 2, 5, 7, 8}));

        System.out.println(MissingNumber.missingNumberCyclicSort(new int[]{3, 4, 6, 2, 1, 7}));
    }

}
