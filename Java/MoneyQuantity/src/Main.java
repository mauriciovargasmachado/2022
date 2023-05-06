import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Intro = new Scanner(System.in);

        double dinero_1;

        System.out.println("Please type the amount of money of user No 1: $");
        dinero_1  = Intro.nextDouble();

        double resultado_1  = dinero_1;

        double resultado_2  = resultado_1/2;

        double resultado_3  = (resultado_1+resultado_2)/2;

        System.out.println("The amount of money of user 1 is: $"+ resultado_1);

        System.out.println("The amount of money of user 2 is: $"+resultado_2);

        System.out.println("The amount of money of user 3 is: $"+resultado_3);
    }
}