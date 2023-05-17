import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a [], number,aux;

        number = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number of elements of the array: "));

        a = new int[number];

        for(int i=0;i<number;i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+". Please insert the "+(i+1)+" element of your array: "));
        }

        // Buble sort

        for(int i=0;i<(number-1);i++){
            for(int j=0;j<(number-1);j++){
                if(a[j]>a[j+1]){
                    aux = a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }

        for( int i=0;i<number;i++){
            JOptionPane.showMessageDialog(null,"This is the "+(i+1)+" Element of your array: "+a[i]);
        }
    }
}