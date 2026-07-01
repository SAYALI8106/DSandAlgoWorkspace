public class FindtheMissingNumber {

  // brute forec
  // public static int foundMissing(int arr[]) {
  // for (int i = 1; i <= arr.length; i++) {
  // boolean found = false;
  // for (int j = 0; j < arr.length; j++) {
  // if (arr[j] == i) {
  // found = true;
  // break;
  // }
  // }
  // if (!found) {
  // return i;
  // }
  // }
  // return -1;
  // }

  // better approach
  // public static int foundMissing(int arr[]) {
  // int hash[] = new int[arr.length + 2];
  // for (int i = 0; i < arr.length; i++) {
  // hash[arr[i]]++;
  // }

  // for (int i = 1; i < hash.length; i++) {
  // if (hash[i] == 0)
  // return i;
  // }
  // return -1;
  // }

  public static int foundMissing(int arr[]) {
    int n = arr.length + 1;
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      sum += arr[i];
    }

    int expectedSum = n * (n + 1) / 2;
    // System.out.println(sum + " " + expectedSum);
    return (expectedSum - sum);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5 };
    int num = foundMissing(arr);
    System.out.println(num);
  }
}
