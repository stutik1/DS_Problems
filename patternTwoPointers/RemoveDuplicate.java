package patternTwoPointers;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void removeDuplicates(int[] arr, int n) {
        if (arr.length == 0 || arr.length == 1) {
            return;
        }
        int[] res = new int[n];
        int j = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                res[j++] = arr[i];
            }
        }
        res[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(res[i] + " ");

        }
    }

    public static void removeDuplicatesMethod2(int[] arr ){
        int j=0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i]!=arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];
        for (int i=0;i< j;i++){

            System.out.print(arr[i] + " ");
        }
    }

    public static void byHashSet(int[] arr){
        HashSet <Integer> hash = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        System.out.println(hash);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 3, 4, 5, 6, 4, 4, 5, 5};
        removeDuplicates(arr, arr.length);

        System.out.println();
        removeDuplicatesMethod2(arr);

        System.out.println();
        byHashSet(arr);
    }
}
