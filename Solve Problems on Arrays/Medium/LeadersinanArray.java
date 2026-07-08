import java.util.*;

public class LeadersinanArray {

  public static void findLeaders(int idx, int[] nums, List<Integer> leaders) {

    for (int i = 0; i < nums.length; i++) {
      boolean leader = true;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] < nums[j]) {
          leader = false;
        }
      }
      if (leader) {
        leaders.add(nums[i]);
      }
    }

  }

  public static void main(String[] args) {
    // int nums[] = { 4, 7, 1, 0 };
    int nums[] = { 10, 22, 12, 3, 0, 6};
    List<Integer> list = new ArrayList<>();
    findLeaders(0, nums, list);
    for(int x: list){
      System.out.println(x);
    }
  }
}
