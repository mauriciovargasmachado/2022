import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int matrix [][],rows,columns;

        System.out.println("Please insert the number of rows: ");
        rows = entry.nextByte();
        System.out.println("Please insert the number of columns: ");
        columns = entry.nextByte();

        matrix=new int [rows][columns];


        for(int i = 0; i<rows;i++){

            for(int j = 0; j<columns;j++) {

                System.out.print(matrix[i][j]);
            }

            System.out.println("");

        }

    }
}