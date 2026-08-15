import java.util.ArrayList;
import java.util.List;

public class MergeSort {
  public static void merge(int arr[], int low, int mid, int high) {

    int[] temp = new int[high - low + 1];
    // List<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;
    int idx = 0;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp[idx++] = arr[left++];
        // temp.add(arr[left++]);
      } else {
        temp[idx++] = arr[right++];
        // temp.add(arr[right++]);
      }
    }

    while (left <= mid) {
      temp[idx++] = arr[left++];
      // temp.add(arr[left++]);
    }

    while (right <= high) {
      temp[idx++] = arr[right++];
      // temp.add(arr[right++]);
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp[i - low];
      // arr[i] = temp.get(i - low);
    }

  }

  public static void mergeSort(int arr[], int low, int high) {
    if (low >= high)
      return;
    int mid = (low + high) / 2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  public static void main(String[] args) {
    int arr[] = { 3, 2, 8, 5, 1, 4, 23 };
    mergeSort(arr, 0, arr.length - 1);
    for (int num : arr) {
      System.out.println(num + " ");
    }

  }
}

// time-> O(n*logn)
// space -> O(n)

// 0+6/2 = 3
// 3,2,8,5,1,4,23
// 3 2 8 5 // 1 4 23 2 3 5 8 1 4 23
// 0 + 3/2 = 1
// 3 2 // 8 5
// 0+1/2 = 0 // 2+3/2 = 2
// 3 // 2

// 2 3
//
