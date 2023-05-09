import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int grade;

        grade = Integer.parseInt(JOptionPane.showInputDialog("Please type your grade: "));

        if(grade<=5){
            JOptionPane.showMessageDialog(null,"You have fail!!!");
        }
        else if (grade > 5 && grade < 7) {
            JOptionPane.showMessageDialog(null,"You have a C!!!");
        }
        else if (grade >= 7 && grade < 9) {
            JOptionPane.showMessageDialog(null,"You have a B!!!");
        }

        else if (grade >= 9 && grade <= 10) {
            JOptionPane.showMessageDialog(null,"You have a A!!!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Out of range, please try again!");
        }

    }
}