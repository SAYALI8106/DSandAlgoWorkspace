import java.util.HashMap;

public class CountthenumberofsubarrayswithgivenxorK {
  public static int findXorSubarray(int nums[], int k) {
    // brute force
    // time -> O(n^2)
    // space -> O(1)
    // int count = 0;
    // for (int i = 0; i < nums.length; i++) {
    // int xor = 0;
    // for (int j = i; j < nums.length; j++) {
    // xor ^= nums[j];
    // if (xor == k) {
    // count++;
    // }
    // }
    // }
    // return count;

    // optimal
    // time -> O(n)
    // sppace -> O(n)
    // store frequency of prefix XORs
    HashMap<Integer, Integer> map = new HashMap<>();
    // Initialize prefix xor with 0
    map.put(0, 1);
    int count = 0;
    int prefixXor = 0;

    for (int i = 0; i < nums.length; i++) {
      prefixXor ^= nums[i];
      int target = prefixXor ^ k;

      if (map.containsKey(target)) {
        count += map.get(target);
      }

      map.put(prefixXor, map.getOrDefault(prefixXor, 0) + 1);

    }

    return count;
  }

  public static void main(String[] args) {
    // int nums[] = { 4, 2, 2, 6, 4 };
    // int k = 6;
    int nums[] = { 5, 6, 7, 8, 9 };
    int k = 5;
    int count = findXorSubarray(nums, k);
    System.out.println("The number of subarrays with the given XOR: " + k + " is: " + count);
  }
}
