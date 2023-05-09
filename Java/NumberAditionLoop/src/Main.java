import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number,number_1, number_2;

        number = Integer.parseInt(JOptionPane.showInputDialog("Please type a number; "));

        while (number!=0){
            number_1 =number;
            number_2= number_1+number;

            JOptionPane.showMessageDialog(null,"The count is: "+number_2);

            number = Integer.parseInt(JOptionPane.showInputDialog("Please type a number; "));
        }

    }
}