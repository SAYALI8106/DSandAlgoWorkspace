
class Pattern17 {
  public static void main(String args[]) {
    int n = 4;
    for (int i = 0; i < n; i++) {
    
     
      //space
      for (int j = 0; j <= n-i-1; j++) {
        System.out.print(" ");
      }

      //characters
      char ch = 'A';
      int breakpoint = (2*i+1)/2;
      for(int j = 1; j <= 2*i+1; j++){
         System.out.print(ch);
         if(j <= breakpoint) ch++;
         else ch--;
        }
       

      //space
       for (int j = 0; j <= n-i-1; j++) {
        System.out.print(" ");
      }

      System.out.println();

    }

  }
}

//0       A            [3,1,3]   
//1     A B A          [2,3,2]
//2   A B C B A        [1,5,1]
//3 A B C D C B A      [0,7,0]
