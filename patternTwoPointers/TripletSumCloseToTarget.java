package patternTwoPointers;

public class TripletSumCloseToTarget {
    public static void sumCloseToTargetByBruteForce(int[] arr , int targetSum){
      for (int i=0;i<arr.length-2;i++) {
          for (int j = i + 1; j < arr.length - 1; j++) {
              for (int k = j + 1; k < arr.length; k++) {
                  int sum = arr[i] + arr[j] + arr[k];
                  if (targetSum == sum) {
                      System.out.println(targetSum);;
                  } if (sum > targetSum){
                      System.out.println(sum - targetSum );
                  }
              }
          }
      }
    }

        public static int threeSumClosest(int[] nums, int target) {
            int sum = 0;

            for(int i = 0; i < nums.length -2; i++){
                for(int j = i + 1; j < nums.length-1; j++){
                    for(int k = j + 1; k < nums.length; k++) {
                        if (Math.abs(target -sum)>(target-(nums[i] + nums[j] + nums[k])))
                            sum = (nums[i] + nums[j] + nums[k]);
                    }
                }
            }
            return sum;
        }
    public static void main(String[] args){
        int[] arr = {-2,0,1,2};
        int targetSum = 2;

        sumCloseToTargetByBruteForce(arr,targetSum);

        sumCloseToTargetByBruteForce(new int[]{-1,2,1,-4},1);

        System.out.println(threeSumClosest(new int[]{-1,2,1,-4} ,1));


    }
}
