public class QuickSorting {
  public static int partition(int arr[], int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i < high)
        i++;
      while (arr[j] >= pivot && j > low)
        j--;
      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[j];
    arr[j] = arr[low];
    arr[low] = temp;
    return j;

  }

  public static void quickSort(int arr[], int low, int high) {
    if (low >= high)
      return;
    int pivotIndex = partition(arr, low, high);
    quickSort(arr, low, pivotIndex - 1);
    quickSort(arr, pivotIndex + 1, high);
  }

  public static void main(String[] args) {
    int arr[] = { 4, 1, 7, 9, 3 };
    quickSort(arr, 0, arr.length - 1);
    for (int num : arr) {
      System.out.println(num + " ");
    }
  }
}

// 4,1,7,9,3
// 4 1 3 9 7
// 3 1 4 9 7
