
//Determines and counts instances of each lowercase vowel plus consonant count.

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {

		char letter, a, e, i, o, u, con;
		String str;
		int position, end, aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, nonCount = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a phrase or sentence: ");
		str = scan.nextLine();

		position = 0;
		end = str.length();

		do {
			letter = str.charAt(position);

			switch (letter) {
			case 'a':
				aCount = aCount + 1;
				break;
			case 'e':
				eCount = eCount + 1;
				break;
			case 'i':
				iCount = iCount + 1;
				break;
			case 'o':
				oCount = oCount + 1;
				break;
			case 'u':
				uCount = uCount + 1;
				break;
			default:
				nonCount = nonCount + 1;
			}
			position++;

		} while (position < end);

		scan.close();

		System.out.println("The number of a's: " + aCount + "  e's: " + eCount + "  i's: " + iCount + "  o's: " + oCount
				+ "  u's: " + uCount + " " + "non-vowel character's: " + nonCount);
	}
}
