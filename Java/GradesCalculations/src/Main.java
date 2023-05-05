import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Initial Data
        Scanner intro = new Scanner(System.in);
        double grade_1,grade_2,grade_3,adition;

        //Requiring data from users
        System.out.println("Por favor digite tres calificaciones: ");
        grade_1 = intro.nextDouble();
        grade_2 = intro.nextDouble();
        grade_3 = intro.nextDouble();

        // operations
        double grades = grade_1+grade_2 +grade_3;


        // Data delivery
        System.out.println("The Sum of all the grades is: "+ grades);


    }
}