import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number_1,number_2,number_3;

        number_1 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your first number: "));
        number_2 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your Second number: "));
        number_3 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your third number: "));

        if(number_1>number_2 && number_2>number_3){
            JOptionPane.showMessageDialog(null,+number_1+" is bigger than "+number_2+ " than is bigger than "+number_3);
        }

        if(number_2>number_1 && number_1>number_3){
            JOptionPane.showMessageDialog(null,+number_2+" is bigger than "+number_1+ " than is bigger than "+number_3);
        }

        if(number_3>number_2 && number_2>number_1){
            JOptionPane.showMessageDialog(null,+number_3+" is bigger than "+number_2+ " than is bigger than "+number_1);
        }

        if(number_2>number_3 && number_3>number_1){
            JOptionPane.showMessageDialog(null,+number_2+" is bigger than "+number_3+ " than is bigger than "+number_1);
        }

    }
}