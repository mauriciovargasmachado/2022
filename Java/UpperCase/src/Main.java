import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int letter;

        letter = JOptionPane.showInputDialog("Please insert one letter: ").charAt(0);

        if (Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null,"Your have typed a capital letter.");
        }
        else{
            JOptionPane.showMessageDialog(null,"Your have typed a lowercase letter.");
        }

    }
}