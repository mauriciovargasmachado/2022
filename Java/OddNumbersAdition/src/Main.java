public class Main {
    public static void main(String[] args) {

        // declare the value
        long producto = 1;

        // create the loop
        for (int i = 1 ; i<20; i+=2){
            producto *= i;
        }

        //leave the result out of the loop to get just one answer.
            System.out.println("The multiplication of your numbers is: "+producto);



    }
}