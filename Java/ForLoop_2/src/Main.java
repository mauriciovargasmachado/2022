import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Por favor ingrese la cantidad de numeros que espera optener: ");
        numero =entrada.nextInt();

        for (int i=1;i<=numero;i++){
            System.out.println("This is the number "+i);
        }

    }
}