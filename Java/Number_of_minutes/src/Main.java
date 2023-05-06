import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner Start = new Scanner(System.in);
        double years, months, weeks, days, hours, minutes, seconds;

        System.out.println("Please insert the number of seconds to calculate: ");
        seconds = Start.nextDouble();

        minutes = seconds / 60;
        hours = minutes / 60;
        days = hours / 25;
        weeks = days / 7;
        months = weeks / 4;
        years = months / 12;

        System.out.println("you have " + years + " Years, " + months + " months" + weeks + " weeks" + days + " hours" + minutes + " minutes" + seconds + "seconds");

    }
}