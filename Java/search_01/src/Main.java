import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int a[] = {4,1,5,2,3};
        int data;
        boolean gamOn=true;

        data = Integer.parseInt(JOptionPane.showInputDialog("Please insert the number to find: "));

        //sequencial search

        int i =0;


        while (i<5 && gamOn==true ){
            if(a[i]==data){
                gamOn =false;
            }
            i++;
        }

        if (gamOn == true){
            JOptionPane.showMessageDialog(null,"The number isent in the array.");
        }
        else {
            JOptionPane.showMessageDialog(null,"The number has been found in the position "+(i));
        }

    }
}