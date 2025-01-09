package lab_exercises.type_conversions;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float radius = scan.nextFloat();
        if(radius>=1 && radius<=1000){
            float Area  = (float) (Math.PI*radius*radius);
            System.out.println(String.format("%.2f",Area));
            
        }
        scan.close();
    
    }
}
    

