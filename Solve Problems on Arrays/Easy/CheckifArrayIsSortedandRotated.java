public class CheckifArrayIsSortedandRotated {
    public static boolean check(int[] nums) {
        int drops = 0;
        for (int i = 0; i < nums.length; i++) {
            int nextIndex = (i + 1) % nums.length;
            if (nums[i] <= nums[nextIndex]) {

            } else {
                drops++;
            }

            if (drops > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
     int[]nums = {3,4,5,1,2};
     int[]nums2 = {2,1,3,4};
     System.out.println(check(nums));
     System.out.println(check(nums2));
    }
}
