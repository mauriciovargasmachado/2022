import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numeroDeEmpleados, salario,total_salarios=0,salarioMaximo=0,salarioMinimo=0;

        numeroDeEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero de empleados a analizar."));
        JOptionPane.showMessageDialog(null,"Usted ha seleccionado "+numeroDeEmpleados+" para ingresar.");

        for (int i=1;i<=numeroDeEmpleados;i++){

            salario = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el salario del trabajador No."+i+"."));
            total_salarios +=salario;
            if (salarioMaximo<salario){
                salarioMaximo =salario;
            }
            if(salarioMinimo>salario){
                salarioMinimo=salario;
            }

        }
        JOptionPane.showMessageDialog(null,"El total a pagar en nomina este mes es de: "+total_salarios);
        JOptionPane.showMessageDialog(null,"El salario mas alto a a pagar es de: "+salarioMaximo);
        JOptionPane.showMessageDialog(null,"El salario mas bajo a a pagar es de: "+salarioMinimo);
    }
}