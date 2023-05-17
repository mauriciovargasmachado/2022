import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        int a[];
        boolean creciente =false, decreciente =false;

        a= new int[10];


        System.out.println("Please type the values for your array: ");

        for (int i=0; i<10;i++){
            System.out.println("Ingrese el "+(i+1)+" Valor: ");
            a[i] = entry.nextInt();
        }

        for (int i=0; i<9;i++){

            if (a[i]<a[i+1]){
                    creciente=true;
                    System.out.println("Your array is increasing");
            }

            else if (a[i]>a[i+1]){
                decreciente=true;
                System.out.println("Your array is decreasing");
            }

            else{
                System.out.println("Your array is unsorted");
            }

        }






    }
}