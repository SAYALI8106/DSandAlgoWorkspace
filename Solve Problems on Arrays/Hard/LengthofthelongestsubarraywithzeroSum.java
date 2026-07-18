import java.util.Arrays;
import java.util.HashMap;

public class LengthofthelongestsubarraywithzeroSum {
  public static int findSubarray(int nums[]) {

    // brute force
    // time -> O(n^2)
    // space -> O(1)

    // int maxLen = 0;

    // for (int i = 0; i < nums.length; i++) {
    // int sum = 0;
    // int currLen = 0;
    // for (int j = i; j < nums.length; j++) {
    // sum += nums[j];
    // currLen = j - i + 1;
    // if (sum == 0) {
    // maxLen = Math.max(maxLen, currLen);
    // }
    // }

    // }

    // return maxLen;

    // optimal approach
    // time -> O(n)
    // space -> O(n)

    int maxLen = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];

      if (sum == 0) {
        maxLen = i + 1;
      } else {
        if (map.containsKey(sum)) {
          maxLen = Math.max(maxLen, i - map.get(sum));
        } else {
          map.put(sum, i);
        }
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    // int nums[] = { 9, -3, 3, -1, 6, -5 };
    int nums[] = { -1, -1, -1, 1, 1, 1 };
    int len = findSubarray(nums);
    System.out.println("Length of the longest subarray with zero sum: " + len);
  }
}
