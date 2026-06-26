public class SumOfFirstNNaturalNumbers {
  public static int sumOfNNumbers(int n) {
    if (n == 1)
      return 1;
    return n + sumOfNNumbers(n - 1);
  }

  public static void main(String[] args) {
    int N = 10;
    System.out.println(sumOfNNumbers(N));
  }
}
