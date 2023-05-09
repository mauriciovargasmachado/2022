import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner Start = new Scanner(System.in);
        int i = 1, contador;

        System.out.println("Por favor ingrese la cantidad de numeros que quiere contar: ");

        contador = Start.nextInt();

        while (i<=contador){
            System.out.println("Este es el numero: "+i);
            i++;
        }


    }
}