
class Pattern12 {
  public static void main(String args[]) {
    int n = 4;
    int spaces = 2 * (n - 1);
    for (int i = 1; i <= n; i++) {

      // numbers
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      // spaces
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
        
      }
      // numbers
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      System.out.println();
      spaces-=2;
    }

  }
}
// 1 1 1 [1,6s,1] 2n-2-2
// 2 12 21 [2,4s,2] 2
// 3 123 321 [3,2s,2]
// 4 12344321 [4,0s,4]
