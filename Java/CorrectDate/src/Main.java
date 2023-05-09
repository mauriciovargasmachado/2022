import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int day,month,year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number of the day: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number of the month: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number of the year: "));

        if (day>0 && day <30){
            JOptionPane.showMessageDialog(null,"The day "+day+" Is in the correct range" );

            if (month>0 && month<12){
                JOptionPane.showMessageDialog(null,"The month "+month+" Is in the correct range" );

                if(year>0 && year<2023){
                    JOptionPane.showMessageDialog(null,"The year "+year+"Is in the correct range" );
                }
                else {
                    JOptionPane.showMessageDialog(null,"The year "+year+"Is out of range" );
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"The month "+month+" Is out of range" );
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"The day "+day+" Is out of range" );
        }

    }
}