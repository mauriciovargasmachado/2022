import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Intro = new Scanner(System.in);

        double Nota_1,Nota_2,Nota_3;

        System.out.println("Please the grade of your first test: ");
        double nota_1  = Intro.nextDouble();
        System.out.println("Please the grade of your second test: ");
        double nota_2  = Intro.nextDouble();
        System.out.println("Please the grade of your third test: ");
        double nota_3  = Intro.nextDouble();

        double result  = (nota_1+nota_2+nota_3)/3;

        System.out.println("Your average is: "+ result);

    }
}