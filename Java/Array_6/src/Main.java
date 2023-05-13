import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        double[] numbers = new double[5];

        double sumaPositivos = 0, conteo = 0, media;

        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor ingrese el numero " + (i + 1) + ":");
            numbers[i] = entry.nextDouble();

            sumaPositivos += numbers[i];

            conteo += 1;

        }

        System.out.println("El valor de la suma de sus numeros es de: " + sumaPositivos);
        System.out.println("El valor del promedio de los numeros de su array es de:  " + (sumaPositivos / conteo));

    }

}