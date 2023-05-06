import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number_1, number_2;

        number_1 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your First number: "));

        number_2 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your Second number: "));

        if(number_1 < number_2){
            JOptionPane.showMessageDialog(null,+number_1+" is lower than " +number_2+".");
        }
        else if(number_1 > number_2){
            JOptionPane.showMessageDialog(null,+number_2+" is lower than " +number_1+".");
        }
        else{
            JOptionPane.showMessageDialog(null,+number_1+" is equal than " +number_2+".");
        }
    }
}