import java.util.*;

public class Findtherepeatingandmissingnumbers {
  public static int[] findRepeatingandMissing(int[] nums) {
    // brute force
    // time -> O(n^2)
    // space -> O(1)

    // int res[] = new int[2];
    // int n = nums.length;
    // int ExpectedSum = n * (n + 1) / 2;
    // int repeatingNumber = -1;
    // int ActualSum = 0;

    // for (int i = 0; i < n; i++) {
    // ActualSum += nums[i];
    // }

    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (nums[i] == nums[j]) {
    // repeatingNumber = nums[i];
    // break;
    // }
    // }
    // }

    // int missingNumber = ExpectedSum - (ActualSum - repeatingNumber);
    // res[0] = repeatingNumber;
    // res[1] = missingNumber;

    // return res;

    int res[] = new int[2];
    int repeating = -1, missing = -1;
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = nums.length;
    int ExpectedSum = n * (n + 1) / 2;
    int ActualSum = 0;

    for (int i = 0; i < n; i++) {

      ActualSum += nums[i];

      if (map.get(nums[i]) == 2) {
        repeating = nums[i];
      }

      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

    }

    missing = ExpectedSum - (ActualSum - missing);
    res[0] = repeating;
    res[1] = missing;

    return res;

  }

  public static void main(String[] args) {
    // int[] nums = { 3, 5, 4, 1, 1 };
    int[] nums = { 1, 2, 3, 6, 7, 5, 7 };
    int[] res = findRepeatingandMissing(nums);
    System.out.println(res[0] + " " + res[1]);
  }
}

// nums = [3, 5, 4, 1, 1]
// sum = 15
// repeating element = 1
// numsSum = 14
// missing num = sum - (numsSum - repeating element )
// = 15 - (14-1) = 15-13 = 2
// o/p -> [1,2]

// nums = [1, 2, 3, 6, 7, 5, 7]
// sum = 7 ( 7 + 1)/2= 49 + 7/2 = 56/2 = 28
// repeating element = 7
// numsSum = 31
// missing num = 28 - (31-7) = 28 - 24 = 4
// o/p-> [7,4]
