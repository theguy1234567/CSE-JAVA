// package lab_exercises.arrays;
// Tina is organizing her music playlist data where each row of a jagged array represents the durations (in seconds) of songs for a specific playlist. She wants to calculate a weighted sum by multiplying each song's duration by its row index (starting from 1). 



// Help Tina compute this weighted sum for all rows.
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
        scan.close();
    }
}