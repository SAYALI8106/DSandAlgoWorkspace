
public class CheckIfANumberIsArmstrongNumberOrNot {
  public static boolean checkArmstrongNummber(int n){
    int num = n;
    int count  = 0;
    while(n!=0){
       count++;
       n/=10;
    }
    int original = num;
    int sum = 0;
    while(num!=0){
       sum += Math.pow(num%10, count) ;
       num/=10;
    }
    return original == sum;
  }
  public static void main(String[] args) {
    int n = 153;
    System.out.println(checkArmstrongNummber(n));
  }
}
