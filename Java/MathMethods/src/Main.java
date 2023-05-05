
public class Main {
    public static void main(String[] args) {

        //Square root
        double variable_1 = 9;
        double raiz = Math.sqrt(variable_1);
        double intRaiz =(int)Math.sqrt(variable_1);
        System.out.println("The Square of "+variable_1+" is: "+raiz);

        //Pow
        double base = 5;
        double exponente = 5;
        double result = Math.pow(base,exponente);
        System.out.println(result);

        //Round
        double number = 3.1416872;
        double answer = Math.round(number);
        System.out.println(answer);

        //Random between 1 and number_1
        double number_1 = 1000000;
        double number_2 = Math.random();
        double answer_1 = number_1*number_2;
        System.out.println(answer_1);
    }
}