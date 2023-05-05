public class scores {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 500;
        int levelComplete =50;
        int bonus =5;

        if (score == 0) {
            System.out.println("Your Score is: " + score + "Your lose!");
        }
        else if (score < 50) {
            System.out.println("Your Score is: " + score + "Careful your about to die!");
        }
        else {
            System.out.println("Your Score is: " + score + " keep playing");
        }
    }
}
