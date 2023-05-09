import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int age,ageAdd=0,count=0;
        double size, sizeAdd=0;

        for (int i=1;i<=5;i++){
            age = Integer.parseInt(JOptionPane.showInputDialog("Please insert your age, student No. "+i+": "));
            size = Integer.parseInt(JOptionPane.showInputDialog("how tall are you, student No. "+i+": "));

            ageAdd+=age;
            sizeAdd+=size;
            count++;
        }

        int averageAge = ageAdd/count;
        double averageSize =sizeAdd/count;

        JOptionPane.showMessageDialog(null,"The average of the students age is: "+averageAge );
        JOptionPane.showMessageDialog(null,"The average of the students size is: " +averageSize);


    }
}