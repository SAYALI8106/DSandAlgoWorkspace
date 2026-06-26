import java.util.*;

public class hasingUsingHashMap {
  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }

    System.out.println("Iterating Hash Map");
    // Iterate over Map
    for (Map.Entry<Integer, Integer> it : map.entrySet()) {
      System.out.println(it.getKey() + " -> " + it.getValue());
    }

  }

}
