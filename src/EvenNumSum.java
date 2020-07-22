import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {

		// Prints the sum of all even integers between 2 and the input value

		int sum = 0, input, count;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an integer greater than 2: ");
		input = scan.nextInt();

		if (input < 2) {
			System.out.println("Please read directions and reenter a valid integer!");
			input = scan.nextInt();
		} else
			System.out.println("The sum of all even integers from 2 to " + input + "(inclusive) is: ");

		for (count = 2; count <= input; count++) {
			if (count % 2 == 0)
				sum += count;

			count++;

		}
		System.out.print(sum);
		scan.close();
	}
}