

public class ReverseDigitsofANumber {
  public static int reverseDigits(int n){
    int reverse =0;
    while(n>0){
      int remainder = n % 10;
       reverse = remainder + reverse * 10;;
       n/=10;
    }
    return reverse;
  }
  public static void main(String[] args) {
    int n = 12345;
    System.err.println(reverseDigits(n));
  }
}

// 12345%10 -> 5    reverse = 5 + 0 * 10 = 5  
// 1234%10 -> 4    reverse =  4 + 5 * 10 = 54
// 123%10 -> 3  reverse = 3 + 54 * 10 = 543
// 12%10 -> 2  reverse = 2 + 543 * 10 = 5432
// 1 % 10 -> 1 reverse = 1 + 5432 * 10 = 54321
