import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int number, randomNumber,count;

        randomNumber = (int)(Math.random()*100);

        System.out.println(randomNumber);

        number = Integer.parseInt(JOptionPane.showInputDialog("Guess the number: "));

        while (number!=randomNumber){
            if (number>randomNumber){
                JOptionPane.showMessageDialog(null,"Please select a lower number.");
            }
            else if (number<randomNumber){
                JOptionPane.showMessageDialog(null,"Please select a bigger number.");
            }
            else {
                JOptionPane.showMessageDialog(null,"You guess the number.");
            }
            number = Integer.parseInt(JOptionPane.showInputDialog("Guess the number: "));
        }
    }
}