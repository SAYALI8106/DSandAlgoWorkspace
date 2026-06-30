import java.util.*;

public class UnionofTwoSortedArrays {
  // brute force
  // public static int[] findunion(int nums1[], int n, int nums2[], int m) {
  // HashSet<Integer> union = new HashSet<>();
  // for (int i = 0; i < n; i++) {
  // if (!union.contains(nums1[i])) {
  // union.add(nums1[i]);
  // }
  // }
  // for (int i = 0; i < m; i++) {
  // if (!union.contains(nums2[i])) {
  // union.add(nums2[i]);
  // }
  // }

  // int ans[] = new int[union.size()];
  // int i = 0;
  // for (int x : union) {
  // ans[i++] = x;
  // }
  // Arrays.sort(ans);
  // return ans;
  // }

  // optimal two pointer approach
  public static ArrayList<Integer> findunion(int nums1[], int n, int nums2[], int m) {

    ArrayList<Integer> union = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < n && j < m) {
      if (nums1[i] < nums2[j]) {
        if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
          union.add(nums1[i]);
        }
        i++;
      } else if (nums2[j] < nums1[i]) {
        if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
          union.add(nums2[j]);
        }
        j++;
      } else {
        if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
          union.add(nums1[i]);
        }
        i++;
        j++;
      }
    }

    while (i < n) {
      if (union.isEmpty() || union.get(union.size() - 1) != nums1[i]) {
        union.add(nums1[i]);
      }
      i++;
    }

    while (j < m) {
      if (union.isEmpty() || union.get(union.size() - 1) != nums2[j]) {
        union.add(nums2[j]);
      }
      j++;
    }
    return union;
  }

  public static void main(String[] args) {
    int nums1[] = { 1, 2, 3, 4, 5 };
    int nums2[] = { 2, 3, 4, 4, 5 };
    ArrayList<Integer> union = findunion(nums1, nums1.length, nums2, nums2.length);
    for (int i : union) {
      System.out.print(i + " ");
    }
  }
}
