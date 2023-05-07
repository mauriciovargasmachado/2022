import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number_1,number_2;

        number_1 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your first number"));

        number_2 = Integer.parseInt(JOptionPane.showInputDialog("Please insert your second number"));

        if(number_1%2 ==0 && number_2 %2==0){
            JOptionPane.showMessageDialog(null,"The selected numbers are Even!!!");
        }
        else if(number_1%2 ==0 && number_2%2 !=0){
            JOptionPane.showMessageDialog(null,"The first selected number is even and the second is Odd!!!");
        }
        else if (number_1%2 !=0 && number_2%2 ==0){
            JOptionPane.showMessageDialog(null,"The first selected number is Odd and the second is even!!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"The selected numbers are Odd!!!");
        }
    }
}