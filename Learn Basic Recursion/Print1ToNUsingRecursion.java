
// public class Print1ToNUsingRecursion {
// public static void printNumbers(int n){
//   if(n == 0) return;
//   printNumbers(n-1);
//   System.out.println(n);
// }
//   public static void main(String[] args) {
//     int n = 10;
//     printNumbers(n);
//   }
// }

public class Print1ToNUsingRecursion {
public static void printNumbers(int current, int n){
  if(current > n) return;
  System.out.println(current);
  printNumbers(current + 1, n);
}
  public static void main(String[] args) {
    int n = 10;
    printNumbers(1,n);
  }
}
