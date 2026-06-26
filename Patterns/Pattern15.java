
class Pattern15 {
  public static void main(String args[]) {
    int n = 5;

    for (int i = 0; i < n; i++) {

      for (char ch = 'A'; ch <= 'A' + n - i - 1; ch++) {
        System.out.print(ch + " ");

      }

      System.out.println();

    }

  }
}
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
