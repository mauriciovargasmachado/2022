public class ScoreChallenge {
    public static void main(String[] args) {

        calculateScore(boolean gameOver, int score, int levelComplete, int bonus);

        int finalScore =score;

        if (gameOver){
            finalScore = finalScore+(levelComplete*bonus);
            System.out.println("Your final Score is: "+finalScore);
        }
    }
    public static void calculateScore(boolean gameOver, int score, int levelComplete, int bonus){

        boolean gameOver = true;
        int score = 500;
        int levelComplete =50;
        int bonus =5;


    }
}
