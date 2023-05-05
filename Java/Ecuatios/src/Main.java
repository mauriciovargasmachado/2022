import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaracion
        Scanner start = new Scanner(System.in);
        float numero1,numero2,suma,resta,multiplicacion,division,modulo;

        //Ingreso de datos
        System.out.println("Por favor dijite dos numeros: ");
        numero1 = start.nextFloat();
        numero2 = start.nextFloat();

        //Operaciones
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1*numero2;
        division = numero1 - numero2;
        modulo = numero1%numero2;

        //Salida de datos
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
        System.out.println("El resultado de la modulo es: "+modulo);



    }
}