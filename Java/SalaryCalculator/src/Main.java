import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Intro = new Scanner(System.in);

        double QuantityOfCarsSold,CarsValue;

        System.out.println("Please type the quantity of cars sold this month: ");
        QuantityOfCarsSold  = Intro.nextDouble();
        System.out.println("Please type the price of each car sold this month: $");
        CarsValue = Intro.nextDouble();

        double result  = (QuantityOfCarsSold*150)+((CarsValue*5/100)*QuantityOfCarsSold)+1000;

        System.out.println("The salary of this month is: $"+ result);

    }
}