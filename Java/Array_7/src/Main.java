import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int a[], b[],c[];

        a= new int[10];
        b= new int[10];
        c= new int[20];

        System.out.println("Please type the values for your first array: ");

        for (int i=0; i<10;i++){
            System.out.println("Ingrese el "+i+" Valor: ");
            a[i] = entry.nextInt();
        }

        System.out.println("Please type the values for your second array: ");

        for (int i=0; i<10;i++){
            System.out.println("Ingrese el "+i+" Valor: ");
            b[i] = entry.nextInt();
        }

        System.out.println("Here are the mix values of your array: ");

        int j = 0;
        for (int i=0; i<10;i++){

            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }

        for( int i=0; i<20;i++){
            System.out.println(c[i]);
        }


    }
}