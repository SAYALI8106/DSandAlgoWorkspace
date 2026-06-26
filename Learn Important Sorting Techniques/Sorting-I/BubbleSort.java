
public class BubbleSort {
  public static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = n - 1; i >= 0; i--) {
      boolean didSwap = false;
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
          didSwap = true;
        }
      }
      if (!didSwap)
        break;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 22, 1223, 11, 3, 22, 2, 0, 3, 4, 1 };
    bubbleSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
