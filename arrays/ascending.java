package arrays;
import java.util.Scanner;
public class ascending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] StudentMarks = new int[10];
        
        for(int i=0 ; i<10 ;i++){
            StudentMarks[i] = scan.nextInt();
        }
        // // display
        // for(int i=0 ; i<10 ;i++){
        //     System.out.println(StudentMarks[i]);
        // }
        //display in ascending order
        for(int i = 0; i < 9; i++)
        {
            for(int j = i+1; j < 10; j++){
                if(StudentMarks[i]>StudentMarks[j]){
                    int temp = StudentMarks[i];
                    StudentMarks[i] = StudentMarks[j];
                    StudentMarks[j] = temp;
                }

            }
            //
            System.out.println("in ascending order");
            for(int t=0 ; t<10 ;t++){
                System.out.println(StudentMarks[t]);
            }


        }
        
    }
}
