import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double price, result;

        price = Integer.parseInt(JOptionPane.showInputDialog("Plase insert the price of the item: $"));

        result = price*0.80;

        if (price>300){
            JOptionPane.showMessageDialog(null,"The final price is: $"+result);
        }
        else {
            JOptionPane.showMessageDialog(null,"Your final price is: $"+price);
        }

    }
}