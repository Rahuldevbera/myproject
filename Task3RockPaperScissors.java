//  TASK-3 : ROCK PAPER SCISSORS

import java.util.Scanner;
import java.util.Random;

public class Task3RockPaperScissors {

    public static void main(String[] args) {

        // Declare variables of type integer
        int userChoice, computerChoice, Rock, Paper, Scissors;

        try (// create input object so as to use it's methods for geting use input
                Scanner input = new Scanner(System.in)) {
            // create random input for the computer
            Random rnd = new Random();

            // Assigning values to the following variables:
            Rock = 0;
            Paper = 1;
            Scissors = 2;

            // display the game name
            System.out.println("ROCK - PAPER - SCISSORRS GAME");
            System.out.println("Enter your choice (0=Rock, 1=Paper, 2=Scissors)");
            // User input
            userChoice = input.nextInt();
            // if user chooses above 2
            while (userChoice > 2) {
                System.out.println("Give number between 0 and 2");
                userChoice = input.nextInt();
            }
            // user selections
            if (userChoice == Rock) {
                System.out.println("User chose ROCK");
            } else {
                if (userChoice == Paper) {
                    System.out.println("User chose PAPER");
                } else {
                    System.out.println("User chose SCISSORS");
                }
            }
            // computer input (random)
            computerChoice = rnd.nextInt(3);

            // computer selection
            if (computerChoice == Rock) {
                System.out.println("Computer chose ROCK");
            } else {
                if (computerChoice == Paper) {
                    System.out.println("Computer chose PAPER");
                } else {
                    System.out.println("Computer chose SCISSORS");
                }
            }

            // Results section

            // Draw
            while (userChoice == computerChoice) {
                System.out.println("Draw try again");

                // if user chooses above 2
                userChoice = input.nextInt();
                while (userChoice > 2) {
                    System.out.println("Give number between 0 and 2");
                    userChoice = input.nextInt();
                }
                computerChoice = rnd.nextInt(3);
                // DRAW user selections
                if (userChoice == Rock) {
                    System.out.println("User chose ROCK");
                } else {
                    if (userChoice == Paper) {
                        System.out.println("User chose PAPER");
                    } else {
                        System.out.println("User chose SCISSORS");
                    }
                }
                // DRAW computer selection
                if (computerChoice == Rock) {
                    System.out.println("Computer chose ROCK");
                } else {
                    if (computerChoice == Paper) {
                        System.out.println("Computer chose PAPER");
                    } else {
                        System.out.println("Computer chose SCISSORS");
                    }
                }
            } // END DRAW
        }

        // RESULTS
        if (computerChoice == Rock) {
            if (userChoice == Paper) {
                System.out.println("User wins!");
            } else {
                System.out.println("Computer Wins");
            }
        } else if (computerChoice == Paper) {
            if (userChoice == Rock) {
                System.out.println("Computer wins");
            } else {
                System.out.println("User Wins!");
            }
        } else if (userChoice == Rock) {
            System.out.println("User Wins");
        } else {
            System.out.println("Computer Wins");
        } // END RESULTS
    }// END main

}// END class