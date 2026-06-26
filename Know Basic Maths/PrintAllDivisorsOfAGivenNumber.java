import java.util.*;

public class PrintAllDivisorsOfAGivenNumber {
  public static List<Integer> printDivisors(int num) {
   List<Integer> arr = new ArrayList<>();
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        arr.add(i);
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int num = 36;
   List<Integer> divisors = printDivisors(num);

    System.out.println(divisors);

  }
}
