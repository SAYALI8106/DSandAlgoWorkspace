
public class CheckIfANumberIsPrimeOrNot {
  public static boolean checkPrime(int n){
    if(n < 0) return false;
    for(int i = 2; i < Math.sqrt(n); i++){
       if(n % i == 0) return false;
    }

    return true;
  }
  public static void main(String[] args) {
    int n = 122;
    System.err.println(checkPrime(n));
  }
}
