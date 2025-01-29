package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class alphabeticalorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] StudentNames = new String[7];
        System.out.println("Enter the names of students to sort them in order: ");
        for(int i = 0; i<7; i++){
            StudentNames[i] = scan.nextLine();
        }
        System.out.println("The names of students are: ");
        for(int i = 0; i<7; i++){
            System.out.println(i+1+"."+ StudentNames[i]);
        }
        // logic to sort them
        Arrays.sort(StudentNames);
        System.out.println("The names of students in sroted order are: ");

        for(String student:StudentNames){
            System.out.println("->"+student);
        }
        scan.close();

    }
}
