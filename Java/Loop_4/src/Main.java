import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Please insert a number: "));

        while (number!=0){
            if (number%2==0){
                JOptionPane.showMessageDialog(null,"Your number is even!.");
            } else if (number%2!=0) {
                JOptionPane.showMessageDialog(null,"Your number is odd!.");
            }
            number = Integer.parseInt(JOptionPane.showInputDialog("Please insert a number: "));
        }
    }
}