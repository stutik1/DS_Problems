package patternTwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {
    public static void fourSumByBruteForce(int[] nums , int target){
        for (int i=0;i< nums.length-3;i++){
            for (int j=i+1;j< nums.length-2;j++){
                for (int k=j+1;k< nums.length-1;k++){
                    for (int l=k+1;l< nums.length;l++){
                       int sum = nums[i]+ nums[j]+nums[k]+nums[l];
                       if (sum==target){
                           System.out.println(nums[i]+ "," + nums[j]+ "," +nums[k]+ "," +nums[l]);
                       }
                    }
                }
            }
        }
    }

    public static List<List<Integer>> fourSumByBruteForce2(int[] nums, int target) {
        HashSet<List<Integer>> hash = new HashSet<>();
        if (nums.length == 0){
            return new ArrayList<>(hash);
        }
        for (int i=0;i< nums.length-3;i++){
            for (int j=i+1;j< nums.length-2;j++){
                for (int k=j+1;k< nums.length-1;k++){
                    for (int l=k+1;l< nums.length;l++){
                        int sum = nums[i]+ nums[j]+nums[k]+nums[l];
                        if (sum==target){
                            List<Integer> list =new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                            hash.add(list);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(hash);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> hash = new HashSet();
        if(nums == null || nums.length == 0){
            return new ArrayList<>(hash);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){

                int start = j+1;
                int end = nums.length-1;
                while(start<end){
                    int sum = nums[i] + nums[j] + nums[start] +nums[end];
                     if (sum<0){
                        return new ArrayList<>(hash);
                    }
                    else if(sum>target){
                        end--;
                    }
                    else if(sum<target){
                        start++;
                    }else if (sum == target){
                        hash.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
                        start++;
                        end--;
                    }
                }
            }
        }
        return new ArrayList<>(hash);
    }
    public static void main(String[] args){
         int[] nums = {1,0,-1,0,-2,2};
         int target=0;
        fourSumByBruteForce(nums,target);
        System.out.println(fourSumByBruteForce2(nums,target));
        System.out.println(fourSum(new int[]{1000000000,1000000000,1000000000,1000000000} ,-294967296));

    }
}
