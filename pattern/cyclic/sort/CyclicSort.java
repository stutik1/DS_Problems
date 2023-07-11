package pattern.cyclic.sort;

import java.util.Arrays;

public class CyclicSort {
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if( i != arr[i]-1){   // arr[i] != i+1;
                int index= arr[i]-1;
                int x = arr[i];
                arr[i] = arr[index];
                arr[index] = x;
            }else{
                i++;
            }
        }
    }

    public static int[] bySorting(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args){
        int[] arr ={3, 4, 6, 2, 1, 5};

        System.out.println(Arrays.toString(bySorting(arr)));

        CyclicSort.cyclicSort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

