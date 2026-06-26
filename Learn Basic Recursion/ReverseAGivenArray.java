public class ReverseAGivenArray {
  public static int[] reverseArr(int[] arr) {
    // int reverseArr[] = new int[arr.length];

    // for(int i = 0; i < arr.length; i++){
    // reverseArr[i] = arr[arr.length-1-i];
    // }
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    // return reverseArr;
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int result[] = reverseArr(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
