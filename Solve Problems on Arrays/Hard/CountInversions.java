public class CountInversions {

  public static int merge(int nums[], int low, int mid, int high) {
    int count = 0;
    int left = low;
    int right = mid + 1;
    int[] temp = new int[high - low + 1];
    int idx = 0;

    while (left <= mid && right <= high) {
      if (nums[left] <= nums[right]) {
        temp[idx++] = nums[left++];
      } else {
        temp[idx++] = nums[right++];
        count += (mid - left + 1);
      }
    }

    while (left <= mid) {
      temp[idx++] = nums[left++];
    }

    while (right <= high) {
      temp[idx++] = nums[right++];
    }

    for (int i = low; i <= high; i++) {
      nums[i] = temp[i - low];
    }

    return count;
  }

  public static int mergeSort(int nums[], int low, int high) {
    int cnt = 0;
    if (low >= high)
      return cnt;

    int mid = (low + high) / 2;
    cnt += mergeSort(nums, low, mid);
    cnt += mergeSort(nums, mid + 1, high);
    cnt += merge(nums, low, mid, high);

    return cnt;
  }

  public static int countInversions(int arr[]) {

    // time -> O(n^2)
    // space -> O(1)

    // int cnt = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] > arr[j])
    // cnt++;
    // }
    // }
    // return cnt;

    return mergeSort(arr, 0, arr.length - 1);

  }

  public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 4, 5 };
    int arr[] = { 5, 4, 3, 2, 1 };
    System.out.println("The total inversions in the array is: " + countInversions(arr));

  }
}
