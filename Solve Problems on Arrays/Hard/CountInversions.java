public class CountInversions {

  public static int countInversions(int arr[]) {
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j])
          cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    // int arr[] = {1,2,3,4,5};
    int arr[] = { 5, 4, 3, 2, 1 };
    System.out.println("The total inversions in the array is: " + countInversions(arr));

  }
}
