
class Pattern18 {
  public static void main(String args[]) {
    int n = 5;
    for (int i = 0; i < n; i++) {

      // characters
      char ch = (char) ('A' + n - i - 1);
      for (int j = 0; j <= i; j++) {
        System.out.print(ch);
        ch++;
      }

      System.out.println();

    }

  }
}

// 0 E [1,4]
// 1 C D [2,3]
// 2 C D E [3,2]
// 3 B C D E [4,1]
// 4 A B C D E [5,0]
