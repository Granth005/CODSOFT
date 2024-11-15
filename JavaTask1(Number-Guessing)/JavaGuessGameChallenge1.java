import java.util.Random;
import java.util.Scanner;

public class JavaGuessGameChallenge1 {

    public static void main(String[] args) {
       
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int noOfRounds = 0;
        int userScore = 0;
        boolean playAgain = true;
        int minNum = 50;
        int maxNum = 100;
        
        int maximunAttempts = 9;

        System.out.println("Welcome! Please guess a random number between " + minNum + " and " + maxNum + ".");

        while (playAgain) {
            noOfRounds++;
            int randomNumber = random.nextInt(maxNum - minNum + 1) + minNum;//Generate a random number between (50-100).
            int attempts = 0;
            boolean correctlyGuessed = false;

            System.out.println("\nRound " + noOfRounds + ": You have " + maximunAttempts + " attempts to guess the random number.");

            while (attempts < maximunAttempts && !correctlyGuessed) { 
                System.out.println("Enter your guess number between (" + minNum + " - " + maxNum + "): ");
                int userGuess = scan.nextInt();
                attempts++;

                if (userGuess < minNum || userGuess > maxNum) { //If userguess is higher or lower then the given number range.
                    System.out.println("Invalid input! Please enter a valid number between " + minNum + " and " + maxNum + ".");
                } else if (userGuess == randomNumber) {
                    System.out.println("🎉Great! Your random number was " + randomNumber + ".");
                    System.out.println("It took you " + attempts + " attemps(s).");
                    correctlyGuessed = true;
                    userScore += (maximunAttempts - attempts) + 1;//Incrementing scores based on no. of attempts left.
                } else {
                    if (userGuess < randomNumber) {
                        System.out.println("Your number is too low! Please try again.");
                    } else if (userGuess > randomNumber) {
                        System.out.println("Your number is too high! Please try again.");
                    } 
                }
                //If user's all attempts are over.
                if (!correctlyGuessed && attempts == maximunAttempts) {
                    System.out.println("🙂Sorry you've used all of your attempts. The correct number was " + randomNumber + ".");
                }
            }

            //Prompt user to play another round, if they wish!
            System.out.println("Do you want to play another around? (yes/no): ");
            String response = scan.next().trim().toLowerCase();
            //If user says yes, the new round else final score.
            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("\nThank you for playing! 😄");
                System.out.println("Your final score is: " + userScore + " (after " + noOfRounds + " round(s).)!");
            }
        }
    scan.close();        
    }

}
