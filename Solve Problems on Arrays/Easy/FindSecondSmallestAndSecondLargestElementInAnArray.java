import java.util.Arrays;

public class FindSecondSmallestAndSecondLargestElementInAnArray {
  // brute force
  public static void find2ndSmallestandLargest(int arr[]) {
    if (arr.length == 0) {
      System.out.println("-1 " + "-1");
      return;
    }

    Arrays.sort(arr);
    System.out.println("2nd Smallest element: " + arr[1]);
    System.out.println("2nd Largest element: " + arr[arr.length - 2]);

  }

  // better approach
  public static void find2ndSmallestandLargestapproach2(int arr[]) {
    if (arr.length == 0) {
      System.out.println("-1 " + "-1");
      return;
    }

    int max = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > secondLargest && arr[i] != max) {
        secondLargest = arr[i];
      }
      if (arr[i] < secondSmallest && arr[i] != min) {
        secondSmallest = arr[i];
      }
    }
    System.out.println("Second Smallest: " + secondSmallest);
    System.out.println("Second Largest: " + secondLargest);

  }

  // Optimal approach
  public static void findSmallest(int arr[]) {
    int small = Integer.MAX_VALUE;
    int secondsmall = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < small) {
        secondsmall = small;
        small = arr[i];
      } else if (arr[i] < secondsmall && arr[i] != small) {
        secondsmall = arr[i];
      }
    }
    System.out.println("Second Smallest element: " + secondsmall);
  }

  public static void findLargest(int arr[]) {
    int large = Integer.MIN_VALUE;
    int secondlarge = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > large) {
        secondlarge = large;
        large = arr[i];
      } else if (arr[i] > secondlarge && arr[i] != large) {
        secondlarge = arr[i];
      }
    }
    System.out.println("Second largest element: " + secondlarge);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 213, 1, 3, 12, 4, 3212, 1 };
    find2ndSmallestandLargest(arr);
    find2ndSmallestandLargestapproach2(arr);
    findSmallest(arr);
    findLargest(arr);
  }
}
