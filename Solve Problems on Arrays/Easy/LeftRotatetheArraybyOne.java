public class LeftRotatetheArraybyOne {
  public static void leftRotate(int nums[]) {
    int temp = nums[0];
    for (int i = 1; i < nums.length; i++) {
      nums[i - 1] = nums[i];
    }
    nums[nums.length - 1] = temp;
  }

 
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    // 5,4,3,2,1
    // 2,3,4,5,1
    // 2,3,4,5,1
    leftRotate(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }
}
