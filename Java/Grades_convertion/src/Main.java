import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner start = new Scanner(System.in);
        double mark_1;
        double mark_2;
        double mark_3;
        double final_mark;

        System.out.println("Cual fue el resultado de su primer examen: ");
        mark_1 = start.nextDouble();

        System.out.println("Cual fue el resultado de su segundo examen: ");
        mark_2 = start.nextDouble();

        System.out.println("Cual fue el resultado de su tercer examen: ");
        mark_3 = start.nextDouble();

        double asist = 0.10;
        mark_1 *= 0.25;
        mark_2 *= 0.25;
        mark_3 *= 0.40;

        final_mark = asist+mark_1+mark_2+mark_3;

        System.out.println("Your final Mark is: "+final_mark);
    }
}