import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entry = new Scanner(System.in);

        double[] numbers = new double[5];

        System.out.println("Generando su Array......");

        for (int i=0; i<5;i++){
            System.out.println("Por favor digite el valor No. "+(i+1)+":");
            numbers[i] = entry.nextDouble();
        }

        System.out.println("Imprimiendo los datos en el arreglo ......");

        for (int i=0; i<5;i++){
            System.out.println(numbers[i]);
        }

    }
}