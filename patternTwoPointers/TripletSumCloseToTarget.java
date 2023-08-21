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
    public static void main(String[] args){
        int[] arr = {-2,0,1,2};
        int targetSum = 2;

        sumCloseToTargetByBruteForce(arr,targetSum);

        sumCloseToTargetByBruteForce(new int[]{-3, -1, 1, 2},1);
    }

    @Override
    public String toString(){
        return "";
    }
    @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        return true;
    }
}
