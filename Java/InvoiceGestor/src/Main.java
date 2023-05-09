import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {

        int codigo, litros,litrosArticulo_1=0,mayor600=0;

        double precioPorLitro,valorFactura,facturacionTotal = 0;

        for (int i=1; i<=5;i++){

            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo No."+i+"\n Digite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo No."+i+"\n Digite la cantidad de litros: "));
            precioPorLitro = Double.parseDouble(JOptionPane.showInputDialog("Articulo No."+i+"\n Por favor ingrese el precio por litro: "));

            valorFactura = (double) litros*precioPorLitro;
            facturacionTotal += valorFactura;

            if (codigo ==1){
                litrosArticulo_1 +=litros;
            }
            if(valorFactura>600){
                mayor600++;
            }

        }

        JOptionPane.showMessageDialog(null,"Resumen de ventas:\nFacturacion total: $"+facturacionTotal+"\nLa Cantidad vendida del articulo 1 es de "+litrosArticulo_1+"\nLa cantidad de facturas con valor mayor a $600 es de "+mayor600);


    }
}