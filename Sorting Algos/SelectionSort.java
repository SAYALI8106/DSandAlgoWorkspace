public class SelectionSort {
  public static void selectionSort(int arr[]) {
    int n = arr.length;

    for (int i = 0; i <= n - 2; i++) {
      int min = i;

      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }

      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;

    }
  }

  public static void main(String[] args) {
    int arr[] = { 13, 46, 24, 52, 20, 9 };
    selectionSort(arr);
    for (int num : arr) {
      System.out.println(num + " ");
    }
  }
}


// time -> O(n^2)
// space-> O(1)
