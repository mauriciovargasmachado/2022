import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i = 1,number;

        number = entrada.nextInt();

        do{
            System.out.println("This is the number "+i);
            i--;
        }while (i<=number);

    }
}