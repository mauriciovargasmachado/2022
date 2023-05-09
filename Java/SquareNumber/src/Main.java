import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double number,power;

        number = Integer.parseInt(JOptionPane.showInputDialog("Please insert a number: "));

        while (number >0){

            power = Math.pow(number,2);
            JOptionPane.showMessageDialog(null,"Your number is: "+power);
            number = Integer.parseInt(JOptionPane.showInputDialog("Please insert a number: "));

        }

    }
}