public class FindtheMissingNumber {

  // brute forec
  public static int foundMissing(int arr[]) {
    for (int i = 1; i <= arr.length; i++) {
      boolean found = false;
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] == i) {
          found = true;
          break;
        }
      }
      if (!found) {
        return i;
      }
    }
    return -1;
  }

  // better approach
  public static int foundMissing2(int arr[]) {
    int hash[] = new int[arr.length + 2];
    for (int i = 0; i < arr.length; i++) {
      hash[arr[i]]++;
    }

    for (int i = 1; i < hash.length; i++) {
      if (hash[i] == 0)
        return i;
    }
    return -1;
  }

  // optimal approach
  // Sum upto N
  public static int foundMissing3(int arr[]) {
    int n = arr.length + 1;
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      sum += arr[i];
    }

    int expectedSum = n * (n + 1) / 2;
    System.out.println(sum + " " + expectedSum);
    return (expectedSum - sum);
  }

  // using xor if sum upto n approach fail due to intefer oevr 10^5 here in case of xor there is no such case
  public static int foundMissing4(int arr[]) {
    int n = arr.length + 1;
    int xor1 = 0;
    int xor2 = 0;
    for (int i = 0; i < n - 1; i++) {
      xor2 ^= arr[i];
      xor1 ^= (i + 1);
    }
    xor1 = xor1 ^ n;
    return xor1 ^ xor2;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5 };
    int num = foundMissing4(arr);
    System.out.println(num);
  }
}
