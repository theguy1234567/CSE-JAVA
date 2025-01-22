package arrays;
import java.util.Scanner;
public class MatrixAddition{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no.of rows: ");
        int rows = scan.nextInt();
        System.out.println("enter the no.of columns: ");
        int columns = scan.nextInt();
        
        Matrix matrix1 = new Matrix(rows, columns);
        Matrix matrix2 = new Matrix(rows, columns);

        matrix1.Setval();
        matrix2.Setval();

        System.out.println("Matrix 1:");
        matrix1.Display();
        System.out.println("Matrix 2:");
        matrix2.Display();

        Matrix ResultMatrix = matrix1.add(matrix2);

        ResultMatrix.Display();
        scan.close();


        
    }
}

class Matrix{
    int [][] matrix;
    int rows;
    int columns;

    //constructor
    public Matrix(int rows,int columns){
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
    }

    //value assignmet
    public  void Setval(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the values for matrix");
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < columns;j++){
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j]=scan.nextInt();
            }
        }
        
    }
    public void Display() {
    System.out.println("The matrix is:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(matrix[i][j] + " "); 
        }
        System.out.println();  
    }
}

    public Matrix add(Matrix other){
        Matrix result = new Matrix(this.rows, this.columns);
        for(int i = 0;i<rows;i++){
            for(int j=0;j<columns;j++){
                result.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];

            }
        }
        return result;
    }
    
}
