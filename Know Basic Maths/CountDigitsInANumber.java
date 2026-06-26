public class CountDigitsInANumber {
  public static int countDigits(int n){
    int count = 0;
    // while(n!=0){
    //   n = n/10;
    //   count++;
    // }
    count = (int)Math.log10(n)+1;
    return count;
  }
  public static void main(String[] args) {
    int n = 12345;
    System.out.println(countDigits(n));
  }
  
}

// 12345/10 -> 1234/10 -> 123/10 -> 12/10 -> 1/10

