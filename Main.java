import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Number guessing game


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 101;
        int randomNumber = random.nextInt(min, max);

        System.out.println("Number guessing game");
        System.out.printf("Guess a number between %d-%d ", min, max);

        do {
            System.out.print("Enter a guess:");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {

                System.out.println("Too high! Try again! ❌❌");


            } else if (guess < randomNumber) {
                System.out.println("Too Low! guess Again! ❌❌");
            } else {System.out.println("you guessed right!✅✅ the number you have guessed is: " + guess);
                System.out.println("The number of attempts: " + attempts);

            }



        } while (guess != randomNumber);










        scanner.close();
        }
    }
