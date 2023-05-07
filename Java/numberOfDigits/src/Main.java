import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Please type a value between 0 and 99.999 ."));

        if (number<=9){
            JOptionPane.showMessageDialog(null,"Your number has 1 digit");
        }

        else if (number<=99){
            JOptionPane.showMessageDialog(null,"Your number has 2 digit");
        }

        else if (number<=999){
            JOptionPane.showMessageDialog(null,"Your number has 3 digit");
        }

        else if (number<=9999){
            JOptionPane.showMessageDialog(null,"Your number has 4 digit");
        }

        else if (number<=99999){
            JOptionPane.showMessageDialog(null,"Your number has 5 digit");
        }
        else{
            JOptionPane.showMessageDialog(null,"Your number is out of range!!!");
        }




    }
}