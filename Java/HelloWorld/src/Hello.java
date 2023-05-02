public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello Wold");
        System.out.println("This is a test");
        System.out.println("And this is a new line");


        boolean heIsAnAlien = false;
        if (heIsAnAlien == true){
            System.out.print("He is not an alien!");}
        else{
            System.out.println("He is an alien!");}


        int topScore = -98;
        if(topScore <50 && topScore >0){
            System.out.println("You have failed!");}
        else if (topScore > 50 && topScore<90) {
            System.out.println("you have pass!");}
        else if (topScore>90) {
            System.out.println("you have pass! with honors!!!");}
        else if (topScore>100 || topScore < 0) {
            System.out.println("Error!!!, there is something wrong with the notes");}


        String carManufacturer = "Mazda";
        boolean isLocal = carManufacturer == "Toyota" ? true : false;
        if(!isLocal){
            System.out.println("Your car is a "+carManufacturer+", and is a foreing car!");
        }


        int ageOfClient =16;
        String client = (ageOfClient >=18) ? "The client is over 18!" : "The client still a kid.";
        System.out.println( client);


        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double valueResult = (firstValue + secondValue)*100.00d;
        System.out.println("The total of the addition of the first and second values is: "+valueResult);
        double theModule = valueResult % 40.00d;
        System.out.println("The module is: "+ theModule);
        boolean thereIsNotRemainder = (theModule ==0) ? true : false ;
        System.out.println("it is: "+ thereIsNotRemainder);
        if(!thereIsNotRemainder){
            System.out.println("There is a remainder.");
        }
        else {
            System.out.println("You have no remainder");
        }

    }
}
