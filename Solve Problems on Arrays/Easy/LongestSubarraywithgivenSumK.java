import java.util.HashMap;

public class LongestSubarraywithgivenSumK {
  public static int longestSubArray(int nums[], int k) {
    // int maxLen = 0;

    // brute forec
    // time -> O(n^3)
    // space-> O(1)
    // for (int startIndex = 0; startIndex < nums.length; startIndex++) {

    // for (int endIndex = startIndex; endIndex < nums.length; endIndex++) {

    // int currentSum = 0;
    // for (int i = startIndex; i <= endIndex; i++) {
    // currentSum += nums[i];
    // }

    // if (currentSum == k) {
    // maxLen = Math.max(maxLen, endIndex - startIndex + 1);
    // }
    // }

    // }
    // return maxLen;

    // better approach  // works for all positives, negatives, and zeroes
    // time - > O(n)
    // Space -> O(n)
    HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
    int sum = 0;
    int maxLen = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      // Case 1: subarrays starts from index 0
      if (sum == k) {
        maxLen = Math.max(maxLen, i + 1);
      }
      // Case 2: subarray starts after index 0
      int remaining = sum - k;

      if (prefixSumMap.containsKey(remaining)) {
        int len = i - prefixSumMap.get(remaining);
        maxLen = Math.max(maxLen, len);
      }

      // Store only 1st occurence
      if (!prefixSumMap.containsKey(sum)) {
        prefixSumMap.put(sum, i);
      }

    }
    return maxLen;
    // Sum=25   maxLen=4  i=5  k =15   nums= [10, 5, 2, 7, 1, 9 ]   remaining = 25-15 = 10
    // {10->0,  
    // 15->1 ,
    // 17-> 2,
    // 24->3,
    // 25-> 4,
// 
    // }

    // optimal- if the array contains positives and zeroes only
    // time - O(2n)
    // space - O(1)
    // int left = 0;
    // int right = 0;
    // int maxLen = 0;

    // int sum = 0; // 0 1 2 3 4 5 sum=19 left=2 right=6 k =15 maxLen = 4
    // while (right < nums.length) { // 10, 5, 2, 7, 1, 9
    // sum += nums[right];
    // while (left <= right && sum > k) {
    // sum -= nums[left];
    // left++;
    // }

    // if (sum == k) {
    // maxLen = Math.max(maxLen, right - left + 1);
    // }

    // right++;
    // }

    // return maxLen;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 15, 2, 1, 1, 1 };
    int k = 15;
    int num = longestSubArray(arr, k);
    System.out.println(num);
  }
}
