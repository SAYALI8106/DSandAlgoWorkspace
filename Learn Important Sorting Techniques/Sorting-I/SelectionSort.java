
public class SelectionSort {
  public static void selectionSort(int arr[]) {
    for (int i = 0; i <= arr.length - 2; i++) {
      int min = i;
      for (int j = i + 1; j <= arr.length - 1; j++) {
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
    int arr[] = { 22, 1223, 11, 3, 22, 2, 0, 3, 4, 1 };
    selectionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
