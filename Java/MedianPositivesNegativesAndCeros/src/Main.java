import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number, add_pos=0, add_neg=0, cero_pos=0, cero_neg=0, count = 0;
        double median_pos, median_neg;

        for (int i = 10; i <= 10; i++) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Please type a number: "));

            if (number == 0) {
                count++;
            }
            else if (number > 0){
                add_pos+=number;
                cero_pos++;
            }
            else{
                add_neg+=number;
                cero_neg++;
            }
        }

        if (cero_pos==0){
            System.out.println("You cant have a median with positive numbers.");
        }
        else {
            median_pos = (double)(add_pos/cero_pos);
            System.out.println("The median is: "+median_pos);
        }

        if (cero_neg==0){
            System.out.println("You cant have a median with negative numbers.");
        }
        else {
            median_neg = (double)(add_neg/cero_neg);
            System.out.println("The median is: "+median_neg);
        }


    }
}