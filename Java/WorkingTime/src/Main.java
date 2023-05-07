import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int workinghours;

        workinghours = Integer.parseInt(JOptionPane.showInputDialog("Please insert the amount of worked hours: $"));

        if (workinghours <= 40){
            workinghours = workinghours*16;
            JOptionPane.showMessageDialog(null, "The total amount to pay is: $"+workinghours);
        }
        else if (workinghours >40){
            workinghours =((workinghours-40)*20)+(40*16);
            JOptionPane.showMessageDialog(null, "The total amount to pay is: $"+workinghours);
        }

    }
}