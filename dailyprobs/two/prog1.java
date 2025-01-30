// 1.write a java prog that reverses an array and stores it in the same array
package dailyprobs.two;
import java.util.Scanner;
import java.util.Arrays;



class ReverseArray{

    private int arr[];
    Scanner scan = new Scanner(System.in);
    //constructor
    public ReverseArray(int size){

         arr = new int[size];
    }
    public void inputarray(){
        System.out.println("int for integer string for string arr");
        
        System.out.println("Enter "+arr.length+" elements:");
        for(int i = 0; i < arr.length; i++){
            System.out.println("value for element "+(i+1)+":");
            arr[i] = scan.nextInt();
        }
    }
    public void displayarr(){
        System.out.println("The array is:");
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void reverse(){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        
    }

}

public class prog1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scan.nextInt();
        ReverseArray obj = new ReverseArray(size);
        // System.out.println("new obj created!");
        obj.inputarray();
        System.out.println("before reversing");
        obj.displayarr();
        obj.reverse();
        System.out.println("After reversing");
        obj.displayarr();
        scan.close();



    }
    
}
