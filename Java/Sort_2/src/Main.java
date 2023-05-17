import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int a[],number, position,aux;

        number = Integer.parseInt(JOptionPane.showInputDialog("Please insert the amount of values of your array: "));

        a = new int [number];

        for(int i=0;i<=number;i++){

            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Please insert the first the "+(i+1)+" value of your array: "));

        }

        // sort
        for(int i=0;i<=number;i++){
            position =i;
            aux = a[i];

            while((position>0)&&(a[position-1])>aux){
                a[position]=a[position-1];
                position--;
            }
            a[position]=aux;

        }
        for(int i=0;i<=number;i++) {
            JOptionPane.showMessageDialog(null, a[i]);
        }

    }
}