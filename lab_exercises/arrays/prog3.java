package lab_exercises.arrays;

import java.util.Scanner;
public class prog3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int p  = scan.nextInt();
        for(int i = 1; i<= p;i++){
            int num_songs = scan.nextInt();
            int sum = 0;
            for( int j = 0; j<num_songs;j++){
                sum+=scan.nextInt()*i;
            }
            System.out.println(sum);
        }
    }
}