package lab_exercises.type_conversions;
import java.util.Scanner;

public class prob1 {
    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Num = scan.nextInt();
        if(Num>=1 && Num<=100000){
            double d_num = Double.valueOf(Num);
            System.out.println("Integer: "+Num);
            System.out.println("Double: "+d_num);
        }
    }
}
    

