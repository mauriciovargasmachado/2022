import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double factorial = 1,n;

        n = Integer.parseInt(JOptionPane.showInputDialog("please insert a number: "));

        for (int i = 1; i <= n; i++) {
            factorial  *= i;
        }

        JOptionPane.showInputDialog(null,"The factor of your number is: "+ factorial);

    }
}