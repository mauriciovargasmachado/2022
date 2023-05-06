import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner Start = new Scanner(System.in);
        double number_1,number_2,power,result;

        System.out.println("Please type your first number: ");
        number_1 = Start.nextDouble();
        System.out.println("Please type your second number: ");
        number_2 = Start.nextDouble();

        power =Math.pow(number_1,number_2);

        result = Math.pow(power,2);

        System.out.println("Your power of the power of your numbers is: "+result);

    }
}