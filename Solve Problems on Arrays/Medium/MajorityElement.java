class MajorityElement {
   MajorityElement() {
   }

   public static int majorityElement(int[] var0) {
      int var1 = 0;
      int var2 = 0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 == 0) {
            ++var1;
            var2 = var0[var4];
         } else if (var0[var4] == var2) {
            ++var1;
         } else {
            --var1;
         }
      }

      int var6 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         if (var0[var5] == var2) {
            ++var6;
         }
      }

      if (var6 > var3 / 2) {
         return var2;
      } else {
         return -1;
      }
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{2, 2, 1, 1, 1, 2, 2};
      int var2 = majorityElement(var1);

      for(int var3 = 0; var3 < var1.length; ++var3) {
         System.out.print(var1[var3] + " ");
      }

      System.out.println("\nThe majority element is: " + var2);
   }
}
