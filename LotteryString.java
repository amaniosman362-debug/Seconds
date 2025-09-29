
package vu.lotterystring;
import java.util.Scanner;

public class LotteryString {
    public static void main(String[] args) {
        // Generate a lottery number (two digits as a string)
        String lottery = String.valueOf((int)(Math.random() * 90 + 10)); // random 2-digit number

        // Prompt the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guess.equals(lottery)) {
            System.out.println("Exact match: you win $10,000");
        } else if (guess.charAt(0) == lottery.charAt(1) &&
                   guess.charAt(1) == lottery.charAt(0)) {
            System.out.println("Match all digits: you win $3,000");
        } else if (lottery.contains(String.valueOf(guess.charAt(0))) ||
                   lottery.contains(String.valueOf(guess.charAt(1)))) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }

        input.close();
    }
}




