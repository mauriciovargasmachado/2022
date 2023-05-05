import javax.swing.*;

public class JOption {
    public static void main(String[] args) {

        String text;
        int value;
        char letter;
        double decimal;

        text = JOptionPane.showInputDialog("Please type your name: ");

        value = Integer.parseInt(JOptionPane.showInputDialog("Please type a value: "));

        letter = JOptionPane.showInputDialog("Please type your name: ").charAt(0);

        decimal = Double.parseDouble(JOptionPane.showInputDialog("Please Double value: "));

        JOptionPane.showMessageDialog(null,"your name is: "+ text);

        JOptionPane.showMessageDialog(null,"Your age could be : "+ ((value/2)+7));

        JOptionPane.showMessageDialog(null,"The first leter of your name is: "+letter);

        JOptionPane.showMessageDialog(null,"you have run : "+ decimal +" kilometers.");

    }
}
