import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Daniel","Jhon","Mary","David","Antonio","Joseph"};

        for(int i=0;i<nombres.length;i++){
            JOptionPane.showMessageDialog(null,nombres[i]);
        }

        //This is another option for printing the values.

        for(String i:nombres){
            System.out.println(i);
        }

    }
}