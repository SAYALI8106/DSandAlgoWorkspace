public class MaximunSubarray {

  public static int maxSubArray(int[] nums) {
    // brute force
    // time -> O(n^3)
    // space -> O(1)
    // int maxSum = Integer.MIN_VALUE;
    // for (int startIndex = 0; startIndex < nums.length; startIndex++) {

    // for (int endIndex = startIndex; endIndex < nums.length; endIndex++) {
    // int currSum = 0;
    // for (int i = startIndex; i <= endIndex; i++) {
    // currSum += nums[i];
    // }
    // maxSum = Math.max(maxSum, currSum);
    // }

    // }

    // return maxSum;

    // better approach
    // time -> O(n^2)
    // space -> O(1)
    // int maxSum = Integer.MIN_VALUE;
    // for (int i = 0; i < nums.length; i++) {
    // int currSum = 0;
    // for (int j = i; j < nums.length; j++) {
    // currSum += nums[j];
    // maxSum = Math.max(maxSum, currSum);
    // }
    // }

    // return maxSum;

    // Optimal approach - using Kadane's Algorithm
    // time -> O(n)
    // space -> O(1)
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum > maxSum) {
        maxSum = sum;
      }

      if (sum < 0) {
        sum = 0;
      }
    }

    return maxSum;
  }

  public static int maxSumSubArray(int nums[]) {
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    int startIndex = 0;
    int endIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (sum == 0) {
        startIndex = i;
      }
      sum += nums[i];
      if (sum > maxSum) {
        maxSum = sum;
        endIndex = i;
      }
      if (sum < 0) {
        sum = 0;
        startIndex = i;
      }

    }

    System.out.println("Maximum subarray: ");
    for (int i = startIndex; i <= endIndex; i++) {
      System.out.print(nums[i] + " ");
    }

    System.out.println();

    return maxSum;
  }

  public static void main(String[] args) {
    int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int maxSum = maxSubArray(nums);
    System.out.println("The maximum subarray sum is: " + maxSum);
    int maxSum2 = maxSumSubArray(nums);
    System.out.println("The maximum subarray sum is: " + maxSum2);
  }
}
