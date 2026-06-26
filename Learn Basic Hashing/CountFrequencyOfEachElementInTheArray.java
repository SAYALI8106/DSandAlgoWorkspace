import java.util.*;

public class CountFrequencyOfEachElementInTheArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // Precompute

    int hashArr[] = { 0 };
    boolean[] visited = new boolean[size];
    for (int i = 0; i < size; i++) {
      if (visited[i])
        continue;
       
      for (int j = 0; j < size; j++) {
             hashArr[arr[i]]++;
      }

      System.out.println(arr[i] + " -> " + hashArr[i]);

    }

    // precompute

    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int i = 0; i < size; i++) {
    // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    // }

    // for (int i = 0; i < size; i++) {
    // System.out.println(arr[i] + " -> "+ map.get(arr[i]));
    // }

    sc.close();
  }
}
