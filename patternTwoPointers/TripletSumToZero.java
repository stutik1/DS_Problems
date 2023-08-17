package patternTwoPointers;

import java.util.*;

public class TripletSumToZero {

    public static  List<List<Integer>> threeSumByBruteForce(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        if (nums.length == 0){
            return new ArrayList<>(result);
        }
        Arrays.sort(nums);
        for (int i=0;i< nums.length-2;i++){
            for (int j = i+1 ;j< nums.length-1;j++){
                for (int k = j+1 ;k< nums.length ;k++){
                   if (nums[i] + nums[j] + nums[k]==0){
                       List<Integer> list =new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k]));
                       result.add(list);
                   }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static List<List<Integer>> threeSumByTwoPointer(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        if (nums.length == 0) {
            return new ArrayList<>(result);
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum > 0) {
                    k--;
                } else if(sum < 0) {
                    j++;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(TripletSumToZero.threeSumByBruteForce(nums));
        System.out.println(TripletSumToZero.threeSumByTwoPointer(nums));
    }
}
