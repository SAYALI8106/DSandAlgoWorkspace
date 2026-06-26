
class Pattern20 {
  public static void main(String args[]) {
    int n = 5;
    int spaces = 2*n-2;
    for (int i = 0; i < n; i++) {
     int stars = i;
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
  
  }
}

// 0 *        *     [1,8,1]
// 1 **      **     [2,6,2]
// 2 ***    ***     [3,4,3]
// 3 ****  ****     [4,2,4]
// 4 **********     [5,0,5]
// 5 ****  ****     [4,2,4]
// 6 ***    ***     [3,4,3]
// 7 **     ***     [2,6,2]
// 8 *        *     [1,8,1]

