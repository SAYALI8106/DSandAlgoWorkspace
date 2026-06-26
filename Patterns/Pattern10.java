
class Pattern10 {
  public static void main(String args[]) {
    int n = 5;
    for (int i = 1; i <= 2*n-1; i++) {
      int stars = i;
      if(i > n) stars = 2*n-i;
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
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
//9  * [4,1s,4]
