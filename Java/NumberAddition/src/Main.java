import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number;
        int suma=0;

        for (int i=1;i<=10;i++){

            number = Integer.parseInt(JOptionPane.showInputDialog("Please insert a number: "));
            suma = suma + number;
            JOptionPane.showInputDialog(null,"the addition of your numbers is: "+suma);

        }

    }
}