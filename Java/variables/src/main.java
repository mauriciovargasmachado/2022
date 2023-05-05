public class main {
    public static void main(String[] args) {

        // Datos de tipo primitivos

        char letter ='A';
        System.out.println("Su caracter es: "+letter);
        byte entero =127;
        System.out.println("Su valor de bite es: "+entero);
        short entero1 = 12345;
        System.out.println("Su valor de short es de: "+entero1);
        int entero2 = 2000000000;
        System.out.println("Su valor de int es de: "+entero2);
        long entero3 = 2000000000000000L;
        System.out.println("Su valor de long es de: "+entero3);
        float entero4 = 3.1416F;
        System.out.println("Su valor de float es de: "+entero4);
        double entero5 = entero4*2;
        System.out.println("Su valor de double es de: "+entero5);
        boolean desicion = true;
        System.out.println("Su valor de bollean es de: "+desicion);

        // Datos de tipo no primitivos
        Integer value = null;
        System.out.println("Su valor de Integer es de: "+value);
        String word = "Castel";
        System.out.println("Su palabra es de: "+word);

        //Constants

        final int number =10;
        //number = 20;
        System.out.println("Your constant value is: "+ number);


    }
}
