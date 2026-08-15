public class BubbleSort {

  public static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = n - 2; i >= 0; i--) {
      boolean didSwap = false;
      for (int j = 0; j <= i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          didSwap = true;
        }
      }

      if (!didSwap)
        break;

    }
  }

  public static void main(String[] args) {
    int arr[] = { 13, 46, 24, 52, 20, 9 };
    bubbleSort(arr);
    for (int num : arr) {
      System.out.println(num + " ");
    }
  }
}

// time -> O(N^2) for avg and worst case O(N) for best case
// space -> O(1)

// i = 4 , j = 0,1,2, 3, 4
// 0   1    2   3   4  5
// 13, 46, 24, 52, 20, 9
// 13  24  46  20  9  52

//  i = 3, j = 0, 1, 2, 3
// 13 24 20 9 46 52

// i = 2  j = 0, 1, 2
// 13 24 20 9 46 52
// 13 20 9 24 46 52

// i = 1  j = 0, 1
// 13 20 9 24 46 52
// 13 9 20 24 46 52

//  i = 0 j = 0
// 13 9 20 24 46 52
// 9 13 20 24 46 52
