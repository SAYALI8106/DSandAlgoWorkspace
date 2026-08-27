
public class LowerBound {
  public static int findLowerBound(int arr[], int N, int x) {
    int lowerBound = N;

    for (int i = 0; i < N; i++) {
      if (arr[i] >= x) {
        lowerBound = i;
        break;
      }
    }
    return lowerBound;
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
