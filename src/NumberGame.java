import java.util.Scanner;

public class NumberGame {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Let's play a game");
        System.out.println("I've choose a number between 1 and 100, you will have 10 attempts to guess!!");
        System.out.println("if you wanna exit, enter 0");
        System.out.printf("Please enter a number:\n");

        int attempts = 10;
        do {
            try {
                int inputNumber = Integer.valueOf(scanner.nextLine());
                if (inputNumber == 0) {
                    System.out.println("Bye");
                    break;
                }
                if (inputNumber > 100 || inputNumber < 1) {
                    System.out.println("Number should be between 1 and 100");
                    continue;
                }

                if (inputNumber == randomNumber) {
                    System.out.println("Lucky you!");
                    return;
                } else {
                    attempts--;

                    //Hint
                    if (inputNumber < randomNumber) {
                        System.out.printf("The number is greater than %d\n", inputNumber);
                    } else {
                        System.out.printf("The number is smaller than %d\n", inputNumber);
                    }

                    System.out.printf("wrong, you have %s attempts, ", attempts);
                    if (attempts != 0) {
                        System.out.println("enter other number:");
                    }
                }
            } catch (Exception e) {
                System.out.println("Sorry buddy, try just with integer numbers");
            }
        } while (attempts > 0);

        System.out.printf("You lose the number was %d", randomNumber);
    }
}
