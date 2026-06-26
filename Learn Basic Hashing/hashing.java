import java.util.*;

public class hashing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // precompute

    int hashArr[] = new int[1000000000];
    for (int i = 0; i < size; i++) {
      hashArr[arr[i]] += 1;
    }

    System.out.print("Enter element to find frequency: ");
    int n = sc.nextInt();
    System.out.println("Frequency of " + n + " is " + hashArr[n]);
    sc.close();
  }
}
