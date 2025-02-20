package lab_exercises.arrays;
// Amelia is a data analyst who needs to analyze survey responses where participants have
//  provided ratings ranging from 1 to 25. Her task is to count how many times each
//   rating occurs in the dataset. 



// Write a program to help Amelia generate the frequency 
// distribution of the given ratings.

import java.util.Arrays;
import java.util.Scanner;

class FrequencyCounter {
    void countFreq(int [] arr, int n){
        int[] freq = new int[26];
        for(int i = 0;i<n;i++){
            freq[arr[i]]++;
        }
        
        for(int i =0 ;i < n; i++){
            if(freq[arr[i]]>0){
                System.out.println(arr[i]+" "+freq[arr[i]]);
                freq[arr[i]]=0;
            }
        }
    }
}

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        FrequencyCounter counter = new FrequencyCounter();
        counter.countFreq(arr, n);

        sc.close();
    }
}








