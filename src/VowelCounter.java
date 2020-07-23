
//Determines and counts instances of each lowercase vowel plus consonant count.

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {

		char letter, a, e, i, o, u, con;
		String str;
		int position, end, aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, conCount = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a phrase or sentence");
		str = scan.nextLine();

		position = 0;
		end = str.length() - 1;

		do {
			letter = str.charAt(position);

			switch (letter) {
			case 'A':
				aCount = aCount++;
				break;
			case 'E':
				eCount = eCount++;
				break;
			case 'I':
				iCount = iCount++;
				break;
			case 'O':
				oCount = oCount++;
				break;
			case 'U':
				uCount = uCount++;
				break;
			}
			position++;
			
		} while (str.charAt(position) < end);

		scan.close();

		System.out.println(aCount + " " + eCount);
	}
}
