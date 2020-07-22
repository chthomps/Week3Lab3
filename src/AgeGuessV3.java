
import java.util.Scanner;

public class AgeGuessV3 {

	public static void main(String[] args) {

		// Reads an age guess (int) from the user and prints these.

		int ageGuess, age = 45;

		Scanner scan = new Scanner(System.in);

		System.out.print("Guess my age! Please enter your guess here: ");

		ageGuess = scan.nextInt();

		while (ageGuess != age) {
			if (ageGuess < age)
				System.out.println("You guessed wrong! I'm older");
			else if (ageGuess > age)
				System.out.println("You guessed wrong! I'm younger");
			System.out.print("Guess again!");

			ageGuess = scan.nextInt();
		}

		if (ageGuess == age)
			System.out.println("You guessed correctly!");

		scan.close();
	}

}
