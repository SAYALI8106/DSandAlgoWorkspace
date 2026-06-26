public class PrintFibonacciSeriesUpToNthTerm {

  // public static void printFibonacciSeries(int N) {
  // if (N == 0)
  // System.out.println("0");
  // if (N == 1)
  // System.out.println("0 1");
  // int fib[] = new int[N + 1];
  // fib[0] = 0;
  // fib[1] = 1;
  // for (int i = 2; i <= N; i++) {
  // fib[i] = fib[i - 1] + fib[i - 2];
  // }

  // for (int i = 0; i < N; i++) {
  // System.out.print(fib[i] + " ");
  // }
  // }

  public static void printFibonacciSeries(int N) {
  if (N == 0) {
  System.out.println("0");
  } else {
  int secondLast = 0, last = 1;
  int curr;
  System.out.print("0 1 ");

  for (int i = 2; i < N; i++) {
  curr = last + secondLast;
  secondLast = last;
  last = curr;
  System.out.print(curr + " ");

  }
  }

  }

  // public static int printFibonacciSeries(int N) {
  //   if (N <= 1)
  //     return N;

  //   int last = printFibonacciSeries(N - 2);
  //   int secondLast = printFibonacciSeries(N - 1);
  //   return last + secondLast;

  // }

  public static void main(String[] args) {
    int n = 4;
    printFibonacciSeries(n);
    // System.out.print(printFibonacciSeries(n));
  }
}
