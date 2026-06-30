public class RemoveDuplicatesfromSortedArray {
  public static int removeDuplicates(int[] nums) {
    // Brute Force approach
    // HashSet<Integer> set = new HashSet<>();
    // int j =0;
    // for (int i = 0; i < nums.length; i++) {
    // if(!set.contains(nums[i])){
    // set.add(nums[i]);
    // nums[j++]=nums[i];
    // }
    // }

    // return j;
    // optimal approach
    int k = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] != nums[i]) {
        nums[k++] = nums[i];
      }

    }
    return k;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    System.out.println(removeDuplicates(nums));
  }
}
