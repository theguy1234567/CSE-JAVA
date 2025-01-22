package arrays;

import java.util.Arrays;

public class Sort {
    public static int[] SortArray(int[] array){
        Arrays.sort(array);
        return array;

    }
    public static void main(String[] args) {
        int[] numbers = {5,2,9,1,3};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] SortedNumbers = SortArray(numbers);
        System.out.println("Array after sorting:");
        for (int num : SortedNumbers) {
            System.out.print(num + " ");
        }
    }
}
