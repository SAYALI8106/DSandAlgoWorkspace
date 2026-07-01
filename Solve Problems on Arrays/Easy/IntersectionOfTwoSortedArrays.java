import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {

  // brute force approach
  // public static ArrayList<Integer> findIntersection(int[] nums1, int n, int[]
  // nums2, int m) {
  // int[] visited = new int[m];
  // ArrayList<Integer> intersection = new ArrayList<>();
  // for (int i = 0; i < n; i++) {
  // for (int j = 0; j < m; j++) {
  // if ((nums1[i] == nums2[j] && visited[j] == 0)) {
  // intersection.add(nums1[i]);
  // visited[j] = 1;
  // break;
  // }
  // if (nums2[j] > nums1[i])
  // break;
  // }
  // }
  // return intersection;
  // }

  // optimal approach
  public static ArrayList<Integer> findIntersection(int[] nums1, int n, int[] nums2, int m) {
    ArrayList<Integer> intersection = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < n && j < m) {
      if (nums1[i] == nums2[j]) {
        intersection.add(nums1[i]);
        i++;
        j++;
      } else if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums2[j] < nums1[i]) {
        j++;
      }
    }
    return intersection;
  }

  public static void main(String[] args) {
    int nums1[] = { 1, 2, 3, 4, 5 };
    int nums2[] = { 2, 3, 4, 4, 5 };
    ArrayList<Integer> intersection = findIntersection(nums1, nums1.length, nums2, nums2.length);
    for (int i : intersection) {
      System.out.print(i + " ");
    }
  }
}
