import java.util.*;
class fourSum {
    public static List<List<Integer>> calfourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    for (int d = c + 1; d < n; d++) {
                        if (nums[a] + nums[b] + nums[c] + nums[d] == target) {
                            List<Integer> temp = Arrays.asList(nums[a], nums[b], nums[c], nums[d]);
                            Collections.sort(temp);
                            if (!list.contains(temp)) {
                                list.add(temp);
                            }
                        }
                    }
                }
            }
        }

        return list;
    }

    public static void main(String []args){
       // Input array
        int[] arr = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        // Target sum
        int target = 8;

        
        // Get result
        List<List<Integer>> ans = calfourSum(arr, target);

        // Print result
        for (List<Integer> quad : ans) {
            System.out.println(quad);
        }
    }
}
