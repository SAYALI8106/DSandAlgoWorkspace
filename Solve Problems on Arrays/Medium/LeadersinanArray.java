import java.util.*;

public class LeadersinanArray {

  // brute force
  // time -> O(n^2)
  // space -> O(n)
  // public static void findLeaders(int idx, int[] nums) {

  // List<Integer> leaders = new ArrayList<>();
  // for (int i = 0; i < nums.length; i++) {
  // boolean leader = true;
  // for (int j = i + 1; j < nums.length; j++) {
  // if (nums[i] < nums[j]) {
  // leader = false;
  // }
  // }
  // if (leader) {
  // leaders.add(nums[i]);
  // }
  // }

  // }

  // Optimal approach
  // time -> O(n)
  // space -> O(n)
  public static List<Integer> findLeaders(int idx, int[] nums) {
    List<Integer> leaders = new ArrayList<>();
    int max = nums[nums.length - 1];
    leaders.add(max);

    for (int i = nums.length - 2; i >= 0; i--) {
      if (nums[i] > max) {
        leaders.add(nums[i]);
        max = nums[i];
      }
    }

    Collections.reverse(leaders);
    return leaders;
  }

  public static void main(String[] args) {
    // int nums[] = { 4, 7, 1, 0 };
    int nums[] = { 10, 22, 12, 3, 0, 6 };
    List<Integer> leaders = findLeaders(0, nums);
    for (int x : leaders) {
      System.out.println(x);
    }
  }
}
