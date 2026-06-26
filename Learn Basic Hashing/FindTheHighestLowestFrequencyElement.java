import java.util.*;

public class FindTheHighestLowestFrequencyElement {
  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int arr[] = { 1, 223, 33, 33, 33, 2, 2, 0, 1 };

    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    int minFreq = arr.length;
    int maxFreq = 0;
    int highEl = 0, lowEl = 0;
    for (Map.Entry<Integer, Integer> it : map.entrySet()) {
      if (it.getValue() > maxFreq) {
        highEl = it.getKey();
        maxFreq = it.getValue();
      }
      if (it.getValue() < minFreq) {
        lowEl = it.getKey();
        minFreq = it.getValue();
      }
    }

    System.out.println("Highest Freqeuncy Element is: " + highEl + "->" + maxFreq);
    System.out.println("Lowest Freqeuncy Element is: " + lowEl + "->" + minFreq);
  }
}
