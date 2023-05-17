import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int a[], b[],c[];

        a= new int[12];
        b= new int[12];
        c= new int[24];

        System.out.println("Please type the values for your first array: ");

        for (int i=0; i<12;i++){
            System.out.println("Ingrese el "+i+" Valor: ");
            a[i] = entry.nextInt();
        }

        System.out.println("Please type the values for your second array: ");

        for (int i=0; i<12;i++){
            System.out.println("Ingrese el "+i+" Valor: ");
            b[i] = entry.nextInt();
        }

        System.out.println("Here are the mix values of your array: ");

        int j = 0;
        for (int i=0; i<12;i++){

            c[j]=a[i];
            j+=3;
            c[j]=b[i];
            j+=3;
        }

        for( int i=0; i<24;i++){
            System.out.println(c[i]);
        }


    }
}