import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number_1,number_2,adition,subtraction,multiplication,division;
        char operators;

        number_1 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your first number: "));
        number_2 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your second number: "));
        operators = (JOptionPane.showInputDialog("Please insert your operator A,S,M,D: ")).charAt(0);

        adition = number_1 + number_2;
        subtraction = number_1 - number_2;
        multiplication = number_1 *number_2;
        division = number_1/number_2;

        switch (operators){
            case 'a':
            case 'A':JOptionPane.showMessageDialog(null,"Your answer is: "+adition);
            break;

            case 's':
            case 'S':JOptionPane.showMessageDialog(null,"Your answer is: "+subtraction);
            break;

            case 'm':
            case 'M':JOptionPane.showMessageDialog(null,"Your answer is: "+multiplication);
                break;

            case 'd':
            case 'D':JOptionPane.showMessageDialog(null,"Your answer is: "+division);
                break;

            default:JOptionPane.showMessageDialog(null,"Error, the inserted values are out of range");
        }

    }
}