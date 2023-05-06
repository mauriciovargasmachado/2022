import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number_1;

        number_1 = Integer.parseInt(JOptionPane.showInputDialog("Please type a number between 1 and 5: "));

        switch (number_1){

            case 1: JOptionPane.showMessageDialog(null,"The number your selected is: 1");
            break;

            case 2: JOptionPane.showMessageDialog(null,"The number your selected is: 2");
            break;

            case 3: JOptionPane.showMessageDialog(null,"The number your selected is: 3");
            break;

            case 4: JOptionPane.showMessageDialog(null,"The number your selected is: 4");
            break;

            case 5: JOptionPane.showMessageDialog(null,"The number your selected is: 5");
            break;

            default: JOptionPane.showMessageDialog(null,"The selected number isnt in the range. please select other number!");
            break;

        }

    }
}