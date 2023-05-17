import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int a[],ultimo;

        a = new int[10];

        System.out.println("Por favor ingrese los valores de su array: ");

        for(int i=0;i<10;i++){
            System.out.println((i+1)+". Por favor ingrese el "+(i+1)+" valor de su array: ");
            a[i]=entry.nextInt();
        }

        ultimo = a[9];

        for(int i = 8;i>=0;i--){
            a[i+1]= a[i];
        }

        a[0]=ultimo;

        System.out.println("El nuevo arreglo es: ");
        for (int i =0;i<10;i++){
            System.out.println(i+". "+a[i]);
        }

    }
}