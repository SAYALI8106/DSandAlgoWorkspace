
public class CheckIfANumberIsPalindromeOrNot {
  public static boolean checkPalindrome(int n) {
    int reverseNum = 0;
    int originalNum = n;
    while (n > 0) {
      int remainder = n % 10;
      reverseNum = reverseNum * 10 + remainder;
      ;
      n /= 10;
    }
    return reverseNum == originalNum;
  }

  public static void main(String[] args) {
    int n = 1221;
    System.err.println(checkPalindrome(n));
  }
}
