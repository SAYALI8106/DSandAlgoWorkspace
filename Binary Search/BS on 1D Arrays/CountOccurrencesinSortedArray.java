public class CountOccurrencesinSortedArray {

  public static int findOccurrences(int[] arr, int x) {

    // brute force
    // time - O(n)
    // space - O(1)

    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {

    // if (arr[i] == x)
    // count++;

    // }

    // return count;

    return (findLastOccurrence(arr, x) - findFirstOccurence(arr, x)) + 1;

  }

  public static int findFirstOccurence(int[] arr, int x) {
    int ans = -1;
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

      int mid = (low + high) / 2;

      if (arr[mid] == x) {
        ans = mid;
        high = mid - 1;
      } else if (arr[mid] < x) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }

    }

    return ans;

  }

  public static int findLastOccurrence(int[] arr, int x) {
    int ans = -1;
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

      int mid = (low + high) / 2;

      if (arr[mid] == x) {
        ans = mid;
        low = mid + 1;
      } else if (arr[mid] < x) {

        low = mid + 1;
      } else {
        high = mid - 1;
      }

    }

    return ans;

  }

  public static void main(String[] args) {
    int[] arr = { 2, 2, 3, 3, 3, 3, 4 };
    int x = 3;
    int count = findOccurrences(arr, x);
    System.out.println("Occurences of " + x + ": " + count);
  }
}
