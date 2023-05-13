import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        int elementos,nuevos;

        elementos = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la cantidad de elementos"));

        int [] numeros = new int[elementos];

        for (int i=0;i<elementos;i++){
            nuevos = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el elemento No."+(i+1)+"."));
            numeros[i]=nuevos;

        }
        for (int i=0;i<elementos;i++) {
            JOptionPane.showMessageDialog(null, "The element No."+(i+1)+" is: "+numeros[i]);
        }

    }
}