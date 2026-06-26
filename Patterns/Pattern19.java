
class Pattern19 {
  public static void main(String args[]) {
    int n = 5;
    for (int i = 0; i < n; i++) {

      // stars
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      // spaces
      for (int j = 0; j < 2 * i; j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      System.out.println();

    }
   for (int i = 0; i < n; i++) {

      // stars
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      // spaces
      for (int j = 0; j < 2*(n-i-1); j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();

    }

  }
}

// 0 **********  [5,0,5]
// 1 **** ****  [4,2,4]
// 2 ***   *** [3,4,3]
// 3 **     ** [2,6,2]
// 4 *       * [1,8,1]
// 0 *       * [1,8,1]
// 1 **     ** [2,6,2]
// 2 ***   *** [3,4,3]
// 3 **** **** [4,2,4]
// 4 **********[5,0,5]
