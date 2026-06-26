public class FactorialOfANumberIterativeAndRecursive {
  public static int calFact(int n) {
    if (n == 0)
      return 1;
    return n * calFact(n - 1);
  }

  public static void main(String[] args) {
    int N = 5;
    System.out.println(calFact(N));
  }
}
