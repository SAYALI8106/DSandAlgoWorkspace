
public class LowerBound {
  public static int findLowerBound(int arr[], int N, int x) {

    // brute force
    // time : O(n)
    // space : O(1)

    // for (int i = 0; i < N; i++) {
    // if (arr[i] >= x) {
    // return i;
    // }
    // }

    // return N;

    int low = 0;
    int high = N;
    int ans = N;
    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid] >= x) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    // int N = 4;
    // int arr[] = { 1, 2, 2, 3 };
    // int x = 2;
    int N = 5;
    int arr[] = { 3, 5, 8, 15, 19 };
    int x = 9;
    int lowerBound = findLowerBound(arr, N, x);
    System.out.println("The lower bound for the given " + x + " is: " + lowerBound);

  }
}
