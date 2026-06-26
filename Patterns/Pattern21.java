
class Pattern21{
  public static void main(String args[]){
    int n = 15;
    for(int i = 0; i < n; i++){
      
         for(int j = 0; j < n; j++){
           if(i==0||i==n-1||j==0||j==n-1){
             System.out.print("*");
           }else{
            System.err.print(" ");
           }
          
         }
         System.out.println("");
       }
  }
}

//0 ****      [2,0,2]

//1 *  *      [1,2,1]

//2 *  *      [1,2,1]

//3 ****      [2,0,2]
