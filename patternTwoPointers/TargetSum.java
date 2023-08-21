package patternTwoPointers;

import java.util.Arrays;

public class TargetSum {
    public static void byBruteForce(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                int sum = arr[i]+ arr[j];
                if(target == sum)
                    System.out.println(arr[i] + " , " + arr[j]);
            }
        }
    }

    public static int[] byTwoPointerApproach(int[] arr,int target){
        int left=0;
        int right = arr.length-1;
        while (left<right) {
            int current_sum = arr[left] + arr[right];
            if (current_sum == target) {
                return new int[]{left, right};
            }
            if (current_sum < target)
                left++;
            else {
                right--;
            }
        }
            return new int[]{0,0};
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6};
        int target =6;
        byBruteForce(arr,target);

        System.out.println(Arrays.toString(TargetSum.byTwoPointerApproach(arr,target)));
        System.out.println(Arrays.toString(byTwoPointerApproach(arr,target)));

        int result[] = TargetSum.byTwoPointerApproach( new int[] {2,5,9,11},11);
        System.out.print(Arrays.toString(result));
    }
}
