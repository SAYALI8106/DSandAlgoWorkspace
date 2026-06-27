import java.util.Arrays;

public class FindTheLargestElementinAnArray {

  public static int findLargest(int arr[]) {
    // brute force approach
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

  public static int findLargest2(int arr[]) {
    // optiomal approach
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int arr[] = { 321, 34, 35, 6, 3, 6, 22, 4, 343454554, 33, 44980988 };
    System.out.println("Largest Element: " + findLargest(arr));
    System.out.println("Largest Element: " + findLargest2(arr));
  }
}
