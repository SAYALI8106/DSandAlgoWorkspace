import java.util.*;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    // brute force
    // time -> O(n^2)
    // space -> O(1)
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i+1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }
    // return new int[] { -1, -1 };

    // better
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];

      if (map.containsKey(complement)) {
        return new int[] { i, map.get(complement) };
      }

      map.put(nums[i], i);
    }

    return new int[] { -1, -1 };

  }

  // Variant 1
  public static int[] twoSumwithIndices(int nums[], int target) {
    // optimal - only if chnaging order is not concern (better approach for
    // returning indexes)
    int n = nums.length;
    int[][] numsWithIndex = new int[n][2];
    for (int i = 0; i < n; i++) {
      numsWithIndex[i][0] = nums[i];// storing value
      numsWithIndex[i][1] = i;// storing index
    }

    Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));
    ;

    int left = 0;
    int right = n - 1;
    while (left < right) {
      int sum = numsWithIndex[left][0] + numsWithIndex[right][0];
      if (sum == target) {
        return new int[] { numsWithIndex[left][1], numsWithIndex[right][1] };
      } else if (sum < target) {
        left++;

      } else {
        right--;
      }
    }
    return new int[] { -1, -1 };
  }

  // Variant 2
  public static String twoSumExists(int[] arr, int target) {
    int n = arr.length;

    // Create an array of pairs [value, original_index]
    int[][] numsWithIndex = new int[n][2];

    // Store each element with its original index
    for (int i = 0; i < n; i++) {
      numsWithIndex[i][0] = arr[i]; // value
      numsWithIndex[i][1] = i; // original index
    }

    // Sort the array based on the value, not index
    Arrays.sort(numsWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

    // Initialize two pointers: one at start, one at end
    int left = 0, right = n - 1;

    // Run loop until pointers cross
    while (left < right) {
      // Calculate the sum of values at pointers
      int sum = numsWithIndex[left][0] + numsWithIndex[right][0];

      if (sum == target) {
        // Found the pair, return "YES"
        return "YES";
      } else if (sum < target) {
        // Sum is less than target, so move left pointer right to increase sum
        left++;
      } else {
        // Sum is greater than target, so move right pointer left to decrease sum
        right--;
      }
    }

    // If loop ends without returning, no pair found
    return "NO";
  }

  public static void main(String[] args) {
    int[] arr = { 2, 6, 5, 8, 11 };
    int target = 14;
    System.out.println(twoSumExists(arr, target)); // Output: YES
    int[] res = twoSumwithIndices(arr, target);
    System.out.println("[" + res[0] + ", " + res[1] + "]");
    int[] res2 = twoSum(arr, target);
    System.out.println("[" + res2[0] + ", " + res2[1] + "]");
  }
}
