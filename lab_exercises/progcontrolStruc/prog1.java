package lab_exercises.progcontrolStruc;
//to check if digits sum is greater than 12
import java.util.Scanner;
public class prog1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String S_num  = String.valueOf(num);
        for (char c : S_num.toCharArray()) {
            int digit = Character.getNumericValue(c);
            System.out.println(digit);
            
        }
        scan.close();
        
    }

    
}
