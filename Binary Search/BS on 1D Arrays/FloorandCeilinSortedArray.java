public class FloorandCeilinSortedArray {
  public static int findFloor(int[] arr, int x) {
    int ans = -1;
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

      int mid = (low + high) / 2;

      if (arr[mid] <= x) {
        ans = arr[mid];
        low = mid + 1;
      } else {
        high = mid - 1;
      }

    }

    return ans;

  }

  public static int findCeil(int[] arr, int x) {
    int ans = -1;
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {

      int mid = (low + high) / 2;

      if (arr[mid] >= x) {
        ans = arr[mid];
        high = mid - 1;
      } else {
        low = mid + 1;
      }

    }

    return ans;

  }

  public static void main(String args[]) {
    int[] arr = { 3, 4, 4, 7, 8, 10 };
    // int x = 5;
    int x = 8;
    int floor = findFloor(arr, x);
    int ceil = findCeil(arr, x);
    System.out.println("The floor and ceil are: " + floor + " " + ceil);
  }
}
