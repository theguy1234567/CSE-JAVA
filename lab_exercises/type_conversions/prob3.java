package lab_exercises.type_conversions;

import java.util.Scanner;

public class prob3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>=0 && num<=1000){
            //printing int
            System.out.println("Intger: "+ num);
            //printing in hexadecimal
            String hex_num = "0x"+Integer.toHexString(num).toUpperCase();
            System.out.println("Hexadecimal: "+ hex_num);
            //printing octal
            String oct_num = "0"+Integer.toOctalString(num);
            System.out.println("Octal: "+ oct_num);
            
            
            scan.close();
            
            
            
        }
        else{
            System.out.println("error");
        }
    }
}
    

