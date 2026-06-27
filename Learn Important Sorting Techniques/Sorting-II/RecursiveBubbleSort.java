public class RecursiveBubbleSort {
  public static void recursiveBubbleSort(int arr[], int n) {
    if (n == 1)
      return;
    int didSwap = 0;
    for (int i = 0; i <= n - 2; i++) {
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = temp;
        didSwap = 1;
      }
    }
    if (didSwap == 1) {
      recursiveBubbleSort(arr, n - 1);
      System.out.println("Swapped" + n);
    }
  }

  public static void main(String[] args) {
    // int arr[] = { 12, 23, 2, 2, 3, 5, 80, 8, 55, 3, 35, 7, 3, 6 };
    int arr[] = { 1,2,3,4,5 };
    recursiveBubbleSort(arr, arr.length);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
