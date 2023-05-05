import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System in integer
        Scanner DataEntry = new Scanner(System.in);
        int value;
        System.out.println("Please type a value: ");
        value=DataEntry.nextInt();

        // System out integer
        System.out.println("The number you have selected is: "+value);


        // System in float
        Scanner DataEntry1 = new Scanner(System.in);
        float value1;
        System.out.println("Please type a value: ");
        value1=DataEntry1.nextFloat();

        // System out float
        System.out.println("The float number you have selected is: "+value1);


        // System in Double
        Scanner DataEntry2 = new Scanner(System.in);
        double value2;
        System.out.println("Please type a value: ");
        value2=DataEntry2.nextDouble();

        // System out float
        System.out.println("The Double number you have selected is: "+value2);


        // System in String
        Scanner DataEntry3 = new Scanner(System.in);
        String value3;
        System.out.println("Please type a word: ");
        value3=DataEntry3.nextLine();

        // System out float
        System.out.println("The String your have right is: "+value3);
    }
}
