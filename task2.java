import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numberToGuess = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;
        System.out.println("Guess the number between 1 and 100:");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
            }
        }
        sc.close();
    }
}
