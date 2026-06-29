public class QuickSort {

  public static void qs(int arr[], int low, int high) {

    if (low < high) {
      int pivotIndex = partition(arr, low, high);
      qs(arr, low, pivotIndex - 1);
      qs(arr, pivotIndex + 1, high);
    }
  }

  public static int partition(int arr[], int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }

      while (arr[j] > pivot && j >= low + 1) {
        j--;
      }
      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    return j;
  }

  public static void main(String[] args) {
    int arr[] = { 123, 13, 1, 32, 1, 13, 1, 3, 5, 54 };
    qs(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
