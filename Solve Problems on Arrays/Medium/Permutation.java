import java.util.ArrayList;
import java.util.List;

public class Permutation {

  // time-> O(n!*n)
  // space -> O(n+n+recursion)
  // public void recurPermute(List<List<Integer>> ans, List<Integer> ds, int[]
  // nums, boolean[] freq) {
  // if(ds.size()==nums.length){
  // ans.add(new ArrayList<>(ds));
  // return;
  // }

  // for(int i = 0; i < nums.length; i++){
  // if(!freq[i]){
  // freq[i]=true;
  // ds.add(nums[i]);
  // recurPermute(ans, ds, nums, freq);
  // ds.remove(ds.size()-1);
  // freq[i]=false;
  // }
  // }
  // }

  // public List<List<Integer>> permute(int[] nums) {
  // List<List<Integer>> ans = new ArrayList<>();
  // List<Integer> ds = new ArrayList<>();
  // boolean freq[] = new boolean[nums.length];
  // recurPermute(ans, ds, nums, freq);
  // return ans;
  // }


   // time-> O(n!*n)
  // space -> O(recursion only)
  public static void recurPermute(int index, List<List<Integer>> ans, int[] nums) {
    if (index == nums.length) {
      List<Integer> ds = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        ds.add(nums[i]);
      }
      ans.add(new ArrayList<>(ds));
      return;
    }

    for (int i = index; i < nums.length; i++) {
      swap(i, index, nums);
      recurPermute(index + 1, ans, nums);
      swap(i, index, nums);
    }
  }

  public static void swap(int i, int j, int nums[]) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    recurPermute(0, ans, nums);
    return ans;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3 };
    List<List<Integer>> permutations = permute(nums);
    System.out.println(permutations);
  }
}

// brute force - dry run
// i=0
// 0 1 2 0 1 2 0 1 2
// [1,2,3] ds= [1, , ] freq=[true, , ] ans=[]
// i = 0,1
// 0 1 2 0 1 2 0 1 2
// [1,2,3] ds= [1, 2, ] freq=[true,true , ] ans=[]
// i = 0,,1,2
// 0 1 2 0 1 2 0 1 2
// [1,2,3] ds= [1, 2, 3] freq=[true,true ,true ] ans = [1,2,3]

// ds = [1,2] freq[true,true,false]
// ds = [1,] freq[true,false,false]
