import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Please insert a number: "));

        if (number %2 ==0){
            JOptionPane.showMessageDialog(null,"Your number is even!!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Your number is Odd!!!");
        }

    }
}