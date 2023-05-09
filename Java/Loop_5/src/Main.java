import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number;
        int count=1;

        number = Integer.parseInt(JOptionPane.showInputDialog("Please type a number: "));

        while (number>=-1){
            JOptionPane.showMessageDialog(null,"Esta es la iteracion No."+count);
            count++;
            number = Integer.parseInt(JOptionPane.showInputDialog("Please type a number: "));
        }

    }
}