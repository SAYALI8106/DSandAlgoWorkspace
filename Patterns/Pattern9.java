
class Pattern9 {
  public static void main(String args[]) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 0; j < 2 * i + 1; j++) {
        System.out.print("*");
      }

      // space
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        System.out.print("*");
      }

      // space
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      System.out.println();
    }

  }
}

// 0 * [4,1s,4]
// 1 *** [3,3s,3]
// 2 ***** [2,5s,2]
// 3 ******* [1,7s,1]
// 4 ********* [0,9s,0]
// 5 ********* [0,9s,0]
// 6 ******* [1,7s,1]
// 7 ***** [2,5s,2]
// 8 *** [3,3s,3]
// * [4,1s,4]
