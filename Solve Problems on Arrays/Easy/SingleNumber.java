public class SingleNumber {
  public static int singleNumber(int[] nums) {
    // brute force
    // time -> O(n^2) not satisfied
    // space -> O(1) satisfied
    // for (int i = 0; i < nums.length; i++) {
    // int count = 0;
    // for (int j = 0; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // count++;
    // }
    // }
    // if (count == 1)
    // return nums[i];
    // }
    // return -1;

    // Better approach
    // time -> O(n) satisfied
    // space -> O(n) not satisfied

    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int num : nums) {
    // map.put(num, map.getOrDefault(num, 0) + 1);
    // }

    // for (int i = 0; i < nums.length; i++) {
    // if (map.get(nums[i]) == 1)
    // return nums[i];
    // }

    // return -1;

    // Optimal approach
    // Time -> O(n)
    // Space -> O(1)

    int xor = 0;
    for (int i = 0; i < nums.length; i++) {
      xor ^= nums[i];
    }
    return xor;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 3, 3, 4, 5, 5 };
    int num = singleNumber(arr);
    System.out.println(num);
  }
}
