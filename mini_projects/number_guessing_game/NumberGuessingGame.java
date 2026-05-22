import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Number Guessing Game\n");

        while (true) {
            int lvl;
            int num = 0;
            try {
                System.out.println("Enter the difficulty of game\n1 for easy (1 to 50)\n2 for medium (1 to 100)\n3 for hard (1 to 200)");
                System.out.print("Enter the level: ");
                lvl = sc.nextInt();
                if ((lvl > 3) || (lvl < 1)) {
                    throw new Exception();
                }
            }
            catch(Exception e) {
                System.out.println("You have entered invalid input");
                sc.nextLine();
                continue;
            }
            switch (lvl) {
                case 1:
                    num = rand.nextInt(50) + 1;
                    break;
                case 2:
                    num = rand.nextInt(100) + 1;
                    break;
                case 3:
                    num = rand.nextInt(200) + 1;
                    break;
            }
            System.out.println();
            int count = 0;
            while (true) {
                int entNum;
                try {
                    System.out.printf("Guess the number [Attempt %d/10]: ", count + 1);
                    entNum = sc.nextInt();
                }
                catch(Exception e) {
                    System.out.println("You have entered incorrect input\n");
                    sc.nextLine();
                    continue;
                }
                count++;
                if (entNum > num) {
                    System.out.println("You have guessed too high\n");
                }
                else if (entNum < num) {
                    System.out.println("You have guessed too low\n");
                }
                else {
                    System.out.printf("Congratulations! you have guessed right on attempt %d\n", count);
                    break;
                }
                if (count == 10) {
                    System.out.printf("Better luck next time! The number was %d.\n", num);
                    break;
                }
            }
            System.out.println("\nEnter 'exit' to quit the game, hit enter to continue the game");
            System.out.print("Enter your choice: ");
            sc.nextLine();
            String choice = sc.nextLine();
            if (choice.toLowerCase().equals("exit")) {
                break;
            }
        }
        System.out.println("\nThanks for playing Number Guessing Game");
        sc.close();
    }
}