package arrays;

public class Copy  {
    public static void main(String[] args) {
        int [] SourceArray = {1,2,3,4,5,6,7};
        int [] CopiedArray = new int[SourceArray.length];
        for(int i = 0;i<SourceArray.length;i++){
            CopiedArray[i] = SourceArray[i];
        }
         System.out.println("Source Array:");
        for (int i : SourceArray) {
            System.out.print(i + " ");
        }
        
        System.out.println("Copied Array:");
        for (int i : CopiedArray) {
            System.out.print(i + " ");
        }
    }
    
}
