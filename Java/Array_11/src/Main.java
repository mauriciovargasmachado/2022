import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int a[],number;
        boolean incresing =true;

        a = new int[10];

        System.out.println("Fill up the array: ");

        do{
            for (int i =0;i<5;i++){

                System.out.println((i+1)+". Please insert the "+(i+1)+" value of your array: ");
                a[i]=entry.nextInt();
            }
            //test if the array is increasing
            for(int i=0;i<4;i++){
                if (a[i]<a[i+1]){
                    incresing=true;
                }
                if (a[i]>a[i+1]){
                    incresing=false;
                    break;
                }
            }
            if (incresing == false){
                System.out.println("The array is not organized.");
            }

        }while(incresing == false);

        System.out.println("Please type the element to insert in your array: ");
        number = entry.nextInt();

    }
}