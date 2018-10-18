package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed int String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result += s.charAt(i);
			}
			System.out.println(result);
		}, "backwards");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				int rand = new Random().nextInt(2);
				if (rand == 0) {
					result += (s.charAt(i) + "").toUpperCase();
				} else if (rand == 1) {
					result += (s.charAt(i) + "").toLowerCase();
				}
			}
			System.out.println(result);
		}, "wacky words");

		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s)->{
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				result+=s.charAt(i);
				if(i==s.length()-1) {
					break;
				} else {
					result += '.';
				}
			}
			System.out.println(result);
		}, "periods");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s)->{
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				if((s.charAt(i) != 'a') && (s.charAt(i) != 'e') && (s.charAt(i) != 'i') && (s.charAt(i) != 'o'	) && (s.charAt(i) != 'u')) {
					result+=s.charAt(i);
				}
			}
			System.out.println(result);
		}, "consonants");

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
