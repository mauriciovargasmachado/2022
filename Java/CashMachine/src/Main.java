import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        final int startBalance = 10000;
        int option, monto, retiro,deposito;

        option = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico!!!\n"
        +"Seleccione 1, para hacer un retiro\n"
        +"Seleccione 2, para hacer un deposito\n"
        +"Seleccion 3 para salir"));


        if (option == 3) {
            JOptionPane.showMessageDialog(null, "Gracias por visitarnos \n que tenga un buen dia!!!");
        }
        else if (option == 1){

            monto = Integer.parseInt((JOptionPane.showInputDialog("Por favor Ingrese el monto: $")));
            retiro = startBalance-monto;
            JOptionPane.showMessageDialog(null,"Su nuevo saldo es: $"+retiro+"\n que tenga un buen dia!!!");
        }
        else if (option == 2){
            monto = Integer.parseInt((JOptionPane.showInputDialog("Por favor Ingrese el monto: $")));
            deposito = startBalance+monto;
            JOptionPane.showMessageDialog(null,"Su nuevo saldo es: $"+deposito+"\n que tenga un buen dia!!!");
        }
        else {
            JOptionPane.showMessageDialog(null,"Error \n Por favor intente de nuevo!!!");
        }

    }
}