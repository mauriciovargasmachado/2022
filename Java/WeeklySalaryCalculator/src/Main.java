import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);
        double hourlySalary;
        double workedHours;
        double addition;

        System.out.println("Please type the amount pacted for hour with the employer: $");
        hourlySalary = intro.nextDouble();
        System.out.println("Please type the worked hours in the week: ");
        workedHours = intro.nextDouble();

        addition = hourlySalary*workedHours;

        System.out.println("The total amount eaerned this week is: $"+addition);
    }
}