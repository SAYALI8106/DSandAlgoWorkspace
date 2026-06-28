public class RecursiveInsertionSort {
  public static void recursiveInsertionSort(int arr[], int i, int n) {
    if (i == n)
      return;

    int j = i;
    while (j > 0 && arr[j - 1] > arr[j]) {
      int temp = arr[j];
      arr[j] = arr[j - 1];
      arr[j - 1] = temp;
      j--;
    }

    recursiveInsertionSort(arr, i + 1, n);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 213, 232, 23, 42, 4, 1, 9, 07, 96, 5 };
    int n = arr.length;
    recursiveInsertionSort(arr, 0, n);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
