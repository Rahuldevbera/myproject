import java.util.Random;
import java.util.Scanner;

public class Task1NumberSystem 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int totalattempts = 0;

        System.out.println("!! Number Game !!");

        do 
        {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("\nGuess the number I'm thinking of between 1 to 100");

            while (!correctGuess && attempts < 8) 
            {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) 
                {
                    System.out.println("Too low! Try again");
                } 
                else if (guess > randomNumber) 
                {
                    System.out.println("Too high! Try again");
                } 
                else 
                {
                    System.out.println("Congratulations! You guessed the right number");
                    correctGuess = true;
                    score++;
                }
            }

            if (!correctGuess) 
            {
                System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + randomNumber);
            }

            totalattempts += attempts;

            System.out.print("Do you want to play again? (yes/no): ");
        } 
        while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Your score is: " + score);
        System.out.println("Number of attempts: " + totalattempts);
        System.out.println("Thank you for playing! GoodBye.");
        scanner.close();
    }
}
