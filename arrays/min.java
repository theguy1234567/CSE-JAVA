package arrays;
public class min {
     public static void main(String[] var0) {
      int[] var1 = new int[]{10, 22, 0, 8, 1};
      int var2 = var1[0];
      int[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         if (var2 > var6) {
            var2 = var6;
         }
      }

      System.out.println("the minimun in the array is " + var2);
    }
}
