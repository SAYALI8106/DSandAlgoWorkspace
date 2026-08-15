
public class InsertionSort {
  public static void insertionSort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 7, 4, 1, 5, 3 };
    insertionSort(arr);
    for (int num : arr) {
      System.out.println(num + " ");
    }
    
  }

}

// time -> O(n^2)  for the best, avg and worst cases
// space -> O(1)

// 7, 4, 1, 5, 3
// 7 | 4 1 5 3
// 4 7 | 1 5 3
// 1 4 7 | 5 3
// 1 4 5 7 | 3
// 1 3 4 5 7
