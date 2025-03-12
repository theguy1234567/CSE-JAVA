// package lab_exercises.arrays;
// Alice is given an array of integers and wants to print each unique element from this array exactly once, in the order they first appear. 



// Design a program to help Alice accomplish this task.
import java.util.Scanner;
// You are using Java
class UniqueElementFinder {
    //Type your code here
    public void printUniqueElements(int [] arr){
        for(int i = 0; i < arr.length;i++){
            boolean isDuplicate = false;
            for( int j = 0;j< i;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(arr[i]+" ");
            }
        }
        
        
    }
}

public class prog4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        UniqueElementFinder finder = new UniqueElementFinder();
        finder.printUniqueElements(arr);

        System.out.println();
        scanner.close();
    
    }
}
