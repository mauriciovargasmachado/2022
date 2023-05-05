import javax.swing.*;

public class operations {
    //Atributos

    int numero1;
    int numero2;
    int suma;
    int resta;


    //Metodos

    //Metodo para pedir numeros al usuario.
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Por Favor digite su primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Por Favor digite su primer numero: "));
    }

    // Metodo para sumar los numeros.
    public void sumarNumeros(){
        suma = numero1+numero2;
    }
    // Metodo para Resta los numeros.
    public void restarNumeros(){
        resta = numero1+numero2;
    }

    public void mostrarResultados(){
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La resta de los numeros es: "+resta);
    }
}
