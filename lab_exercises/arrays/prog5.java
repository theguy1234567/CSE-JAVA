package lab_exercises.arrays;

import java.util.Scanner;

class MatrixAnalyzer {
    int countOccurrences(int[][][] matrix, int element){
        int count =0;
        for(int[][] plane:matrix){
            for(int[] row:plane){
                for(int num :row){
                    if(num == element){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

public class prog5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); 
        int y = scanner.nextInt(); 
        int z = scanner.nextInt(); 

        int[][][] matrix = new int[x][y][z];

       
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    matrix[i][j][k] = scanner.nextInt();
                }
            }
        }

        int elementToCount = scanner.nextInt();

        MatrixAnalyzer analyzer = new MatrixAnalyzer();
        int count = analyzer.countOccurrences(matrix, elementToCount);

        System.out.println(count);

        scanner.close();
    }
}
